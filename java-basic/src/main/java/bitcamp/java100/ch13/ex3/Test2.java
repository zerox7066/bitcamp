package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test2 {
    
    public static void main(String[] args) {
        // 자원을 해제할 경우 try...catch...finally 사용
        
        try (   // java.lang.AutoCloseable 인터페이스 규칙으로 만든 클래스의 객체(finally 필요없음)
                FileReader in = new FileReader("./build.gradle");
                //String s = new String("test...");  // 컴파일 오류!
                //ArrayList<String> list = new ArrayList<>();
            ) {
            System.out.println("파일 읽기 준비 완료!");
            
            int ch;
            while (true) {
                ch = in.read();
                if (ch == -1) {
                    break;
                }
                System.out.print((char)ch);
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("파일 읽기 중 오류 발생!");
            
        } 
    }

}
