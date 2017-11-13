// 데이타 프로세싱 스트림 클래스 사용

package bitcamp.java100.ch14.ex3;

import java.io.FileInputStream;

public class Test2_1 { 
    
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileInputStream in = new FileInputStream("test1.dat");
        
        int len = in.read();
        
        byte[] bytes = new byte[len];
        
        in.read(bytes); 
        
        s.setName(new String(bytes, "UTF-8"));        
        
        s.setKor((in.read() << 24) | (in.read() << 16) | (in.read()  << 8) | (in.read()));
        s.setEng((in.read() << 24) | (in.read() << 16) | (in.read()  << 8) | (in.read()));
        s.setMath((in.read() << 24) | (in.read() << 16) | (in.read()  << 8) | (in.read())); 
        
        in.close();
        
        System.out.println(s);
        
    } 

}
