// 컬렉션 API - HashMap

package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test8 {

    static class MyKey {
        String id;
        String pwd;
        
        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }
    }
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
        HashMap<MyKey, Contact> map = new HashMap<>();
        
        Contact c1 = new Contact("홍길동1", "hong1@test.com", "1111-1111");
        
        MyKey k1 = new MyKey("aaaa", "1111");
                
        map.put(k1, c1);
        
        System.out.println(map.get(k1));     
        
        MyKey k2 = new MyKey("aaaa", "1111");
        
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
        System.out.println(k1.hashCode() == k2.hashCode());  //false
        
        System.out.println(map.get(k2));
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
    }

}
