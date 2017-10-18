// ## 래퍼(wrapper) 클래스 사용법 - 래퍼 클래스의 소개

package bitcamp.java100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test19 {
    
    // entry point
    public static void main(String[] args) {
        ArrayList l;
        HashSet s;
        HashMap m;
        
        // primitive type 변수
        int i =10;
        
        // int wrapper 클래스 사용 : 클래스에서 제공하는 메서드를 이용할 수 있다.
        java.lang.Integer i2 = new java.lang.Integer(10);
        
        System.out.println("--------------------------------------------------");
    }
}






















