// 다형성 - hashCode() 오버라이딩후
// hashCode()의 리턴값은 HashSet이나 HashMap처럼 객체를 저장할 때 사용한다.

package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        // HashSet은 ArrayList 나 MashMap, HashTable 처럼 객체의 주소를 보관
        // HashSet는 개체의 주소를 중복해서 보관하지 않는다.
        HashSet set = new HashSet();
        
        set.add(s1);
        set.add(s2);
        
        // HashSet의 size()는 1이다.
        System.out.println(set.size());
        System.out.printf("s1.equals(s2) = %b\n", s1.equals(s2));
        System.out.printf("s1.hashCode() = %d\n", s1.hashCode());
        System.out.printf("s2.hashCode() = %d\n", s2.hashCode());
        
        System.out.println("---------------------------------------------");
        
        Score2 s3 = new Score2(1, "홍길동", 100, 100, 100);
        Score2 s4 = new Score2(1, "홍길동", 100, 100, 100);
        
        // HashSet은 ArrayList 나 MashMap, HashTable 처럼 객체의 주소를 보관
        // HashSet는 개체의 주소를 중복해서 보관하지 않는다.
        HashSet set2 = new HashSet();
        
        set2.add(s3);
        set2.add(s4);
        
        // HashSet의 size()는 1이다.
        System.out.println(set2.size());
        System.out.printf("s3.equals(s4) = %b\n", s3.equals(s4));
        System.out.printf("s3.hashCode() = %d\n", s3.hashCode());
        System.out.printf("s4.hashCode() = %d\n", s4.hashCode());
        
        System.out.println("---------------------------------------------");
    }

}
