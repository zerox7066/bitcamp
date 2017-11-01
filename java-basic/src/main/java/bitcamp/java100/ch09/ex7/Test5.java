// 컬렉션 API - HashSet

package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {
    
    static class Contact {
        String name;
        String email;
        String tel;
        
        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }
    }
    public static void main(String[] args) {
        
        // Hashset이 중복 데이터임을 판단하는 기준
        // 해시값(hashCode()의 리턴값) 이 다른지 확인
        HashSet<Contact> set = new HashSet<>();
        
        Contact c1 = new Contact("홍길동", "hong@test.com", "1111-111");
        Contact c2 = new Contact("홍길동", "hong@test.com", "1111-111");
        Contact c3 = new Contact("홍길동", "hong@test.com", "1111-111");
        
        set.add(c1);
        set.add(c2);
        set.add(c3);
        
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));       

        
        //System.out.println(set);
        
        Contact[] arr = new Contact[set.size()];
        set.toArray(arr);        
        for (Contact c : arr){
            System.out.printf("%s, %s, %s\n", c.name, c.email, c.tel);
        }
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
    }

}
