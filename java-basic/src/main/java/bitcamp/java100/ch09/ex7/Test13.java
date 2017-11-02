// 컬렉션 API - Iterator
// 컬렉션에서 데이터를 꺼내주는 객체
package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            System.out.printf("%s ", iterator.next());
        }
    }
}
