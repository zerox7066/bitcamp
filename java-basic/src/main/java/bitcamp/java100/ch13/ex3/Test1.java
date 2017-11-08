package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test1 {
    
    public static void main(String[] args) {
        // 자원을 해제할 경우 try...catch...finally 사용
        FileReader in = null;
        try {
            in = new FileReader("./build.gradle");
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
            
        } finally {  // 자원 해제 코드
            System.out.println("finally 실행!");
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }

}
