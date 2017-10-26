// 캡슐화 - 같은 패키이지의 클래스가 접근하는 경우

package bitcamp.java100.ch08.ex1;

public class Test1 {
    
    public static void main(String[] args) {
        // private 접근
        //A.v1 = 100;   // 접근불가!
        
        // default 접근
        A.v2 = 200;
        
        // protected 접근
        A.v3 = 300;
        
        // public 접근
        A.v4 = 400;
    }

}
