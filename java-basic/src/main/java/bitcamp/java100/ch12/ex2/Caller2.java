package bitcamp.java100.ch12.ex2;

import java.util.ArrayList;
import java.util.Iterator;

public class Caller2 {
    
    public static void main(String[] args) {
        Array list = new Array();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
