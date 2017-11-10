// 파일 읽기 : byte stream 읽기

package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_2 {
    
    public static void main(String[] args) throws Exception {

        // 바이트 단위로 데이터를 읽어주는 객체
        FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));
                
        int b = 0;
        int count = 0;
        
        long start = System.currentTimeMillis();
        while((b = in.read()) != -1) {
            count++;
        }
        long end = System.currentTimeMillis();
        
        System.out.printf("읽은 바이트 수 = %d\n", count);
        System.out.printf("걸린시간 = %d\n", (end - start));
         
        in.close();
    }

}
