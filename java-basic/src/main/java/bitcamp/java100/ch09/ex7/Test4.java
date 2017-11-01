// 컬렉션 API - HashSet

package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test4 {
    
    public static void main(String[] args) {
        
        // 같은 객체 : 주소가 같은것, hash값이 같은 것
        HashSet<String> set = new HashSet<>();

        // HashSet은 해시값(hashCode()의 리터값) 이 같다.
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
                
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
        
        System.out.println(s1 == s4);  // false
        System.out.println(s1 == s5);  // false
        System.out.println(s4 == s5);  // false
        
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        
        // String equals는 object에서 overriding
        System.out.println(s1.equals(s4));  // true
        System.out.println(s1.equals(s5));  // true
        System.out.println(s4.equals(s5));  // true
        
        
        
        // HashSet은 집합특성이 있어서 인스턴스를 중복 저장 안됨
        set.add(s4);
        set.add(s5);

        System.out.println(set.size());
        
        String[] arr = new String[set.size()];
        set.toArray(arr);        
        for (String s : arr){
            System.out.printf("%s ", s);
        }
        
        System.out.println();
        System.out.println("-----------------------------------------------");
        
        // 해시 값으로 저장하면 중복 제거 및 빨리 검색할 수 있다.
    }

}
