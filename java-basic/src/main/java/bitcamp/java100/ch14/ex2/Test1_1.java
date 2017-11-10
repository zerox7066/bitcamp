// 파일 읽기 : byte stream 읽기

package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_1 {
    
    public static void main(String[] args) throws Exception {

        // 바이트 단위로 데이터를 읽어주는 객체
        FileInputStream in = new FileInputStream(new File("sample/a.jpg"));
        
        int b;
        int count = 0;
        
        while((b = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
         
        in.close();
    }

}
