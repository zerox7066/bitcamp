// 컬렉션 API - HashMap

package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test9 {

    static class MyKey {
        String id;
        String pwd;
        
        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MyKey other = (MyKey) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            if (pwd == null) {
                if (other.pwd != null)
                    return false;
            } else if (!pwd.equals(other.pwd))
                return false;
            return true;
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
        
        // hashCode(), equals() overriding
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
        System.out.println(k1.hashCode() == k2.hashCode());  // true
        
        System.out.println(map.get(k2));
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
