// 컬렉션 API - HashMap

package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test7 {
    
    static class Contact {
        String name;
        String email;
        String tel;
        
        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }
        
    }
    public static void main(String[] args) {
        
        // key-value 한 쌍으로 이루어진 값을 보관할 때 사용
        // key는 값을 저장하고 찾을 때 사용
        // value는 보관하고자 하는 값 
        HashMap<String, Contact> map = new HashMap<>();
        
        Contact c1 = new Contact("홍길동1", "hong1@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동2", "hong2@test.com", "1111-1112");
        Contact c3 = new Contact("홍길동3", "hong3@test.com", "1111-1113");
        
        map.put("aaa", c1);
        map.put("bbb", c2);
        map.put("ccc", c3);
        
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("ccc"));
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        String key = new String("aaa");
        
        System.out.println("aaa" == key);
        System.out.println("aaa".hashCode());
        System.out.println(key.hashCode());
        System.out.println("aaa".equals(key));
        
        System.out.println(map.get(key));
        
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
