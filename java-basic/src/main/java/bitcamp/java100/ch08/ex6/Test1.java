// 다형성 - hashCode() 오버라이딩전
// hashCode()의 리턴값은 HashSet이나 HashMap처럼 객체를 저장할 때 사용한다.

package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        // ArrayList는 개체의 주소를 중복해서 보관
        ArrayList list = new ArrayList();
        
        list.add(s1);
        list.add(s1);
        
        System.out.println(list.size());
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        
        System.out.println("---------------------------------------------");
        
        // HashSet은 ArrayList 나 MashMap, HashTable 처럼 객체의 주소를 보관
        // HashSet는 개체의 주소를 중복해서 보관하지 않는다.
        HashSet set = new HashSet();
        
        set.add(s1);
        set.add(s1);
        
        // HashSet의 size()는 1이다.
        System.out.println(set.size());
        
        System.out.println("---------------------------------------------");
        
        set.add(s2);
        System.out.println(set.size());
        
        System.out.println("---------------------------------------------");
        
        System.out.printf("s1.equals(s2) = %b\n", s1.equals(s2));
        System.out.printf("s1.hashCode() = %d\n", s1.hashCode());
        System.out.printf("s2.hashCode() = %d\n", s2.hashCode());
        
        System.out.println("---------------------------------------------");
    }

}
