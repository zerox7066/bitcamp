
package bitcamp.java100.ch14.ex2;

import java.io.FileOutputStream;

public class Test2_5 {
    
    public static void main(String[] args) throws Exception {
        
        // 바이트 단위로 데이터를 읽어주는 객체
        int[] data = new int[4000000];
        
        for (int i = 0 ; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }
        
        FileOutputStream out = new FileOutputStream("./test3.dat");
        MyBufferedOutputStream2 out2 = new MyBufferedOutputStream2(out);
        
        long start = System.currentTimeMillis();

        for (int b : data) {
            out2.write(b);
        }
        
        out2.flush();
        
        long end = System.currentTimeMillis();
        
        System.out.printf("걸린시간 = %d\n", (end - start));
        
        out.close();
    }

}
