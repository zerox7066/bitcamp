// 파일 읽기 : byte stream 읽기

package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_0 {
    
    public static void main(String[] args) throws Exception {
        File file = new File("sample/a.jpg");
        
        // 바이트 단위로 데이터를 읽어주는 객체
        FileInputStream in = new FileInputStream(file);
        
        int b;
        int count = 0;
        
        while((b = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
        
        in.close();
    }

}
