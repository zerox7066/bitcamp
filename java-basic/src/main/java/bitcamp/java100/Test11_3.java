// # 자바에서 값 표현(Literal) 하기

package bitcamp.java100;

public class Test11_3 {
    public static void main( String[] args ) {

        System.out.print("ABC");
        System.out.print('\b');  // Backspace : 커서를 뒤로 한 칸 이동
        System.out.println("123");

        System.out.println("ABC\t123");  // Tab
        System.out.println("ABC\u0009123");  // Tab Unicode

        System.out.println("ABC\n123");  // Line Feed(0x000a)

        System.out.println("ABC\r123");  // Carrage Return

        System.out.println("ABC\f123");  // Form Feed

        System.out.println("ABC\"123");  // Double Quote

        System.out.println("ABC'123");  // Single Quote
        System.out.println('\'');  // Single Quote
        System.out.println('"');  // Single Quote

        System.out.println("c:\\workspace\\test");  // Backslash
        
        System.out.println("ABC\r\n123");  // Carrage Return Line Feed
        System.out.println("ABC\n\r123");  // Line Feed Carrage Return
    }
}
