// ## 문장(Statement) - 블록과 변수의 범위
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test16_1 {
    public static void main(String[] args) {
        int a = 100;
        {
            //int a = 100;  // 컴파일 오류!
            
            System.out.println(a);
            
            int b = 200;
            System.out.println(b);
            {
                System.out.println(b);
                int c = 300;
                System.out.println(c);
            }
            //System.out.println(c);  // 컴파일 오류!
        }
        System.out.println(a);
        
        //System.out.println(b);  // 컴파일 오류!
        
        int c = 300;
        
        //int a = 300;  // 컴파일 오류!
    }
}