package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
    
    @Autowired MemberDao memberDao;

    @Override
    public List<Member> list(int pageNo, int pageSize, Map<String, Object> options) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        
        return memberDao.findAll(params);
    }

    @Override
    public Member findByEmailAndPassword(Map<String, Object> params) {
        return memberDao.findByEmailAndPassword(params);
    }

    @Override
    public Member get(int no) {
        return memberDao.findByNo(no);
    }

    @Override
    public int getTotalCount() {
        return memberDao.countAll();
    }

    @Override
    public int add(Member Member) {
        return memberDao.insert(Member);
    }

    @Override
    public int update(Member Member) {
        return memberDao.update(Member);
    }

    @Override
    public int delete(int no) {
        return memberDao.delete(no);
    }

}
