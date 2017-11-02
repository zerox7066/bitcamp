// 컬렉션 API - HashSet
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        
        set.add("홍길동");
        set.add("임꺽정");
        set.add("유관순");
        
        // HashSet에서 데이터를 꺼내주는 객체
        Iterator<String> iterator = set.iterator();
        
        while( iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}







