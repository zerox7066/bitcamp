package java100.app.dao;

import java.util.List;

import java100.app.domain.Member;

//MemberDao 클래스로부터 메서드 호출 규칙만 분리하여 따로 정의한다.
//=> setDataSource()는 컨트롤러가 호출하는 메서드가 아니다.
//=> 그래서 규칙에서 제외했다.
//=> 이 규칙은 MemberController가 호출하는 규칙이다.
//
public interface MemberDao {
    List<Member> selectList();
    int insert(Member member);
    int update(Member member);
    int delete(int no);
    Member selectOne(int no);
}















