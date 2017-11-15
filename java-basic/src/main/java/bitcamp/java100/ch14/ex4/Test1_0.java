// 데이타 프로세싱 스트림 클래스 사용

package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_0 {
    
    public static void main(String[] args) throws Exception {
        Score s = new Score("홍길동", 800, 900, 1000);
        
        //FileOutputStream out = new FileOutputStream("test3.dat");
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test3.dat"));
         
        // serialization(인스턴스 변수의 값을 바이트 배열로 만들어 출력
        out.writeObject(s);
        
        
        out.close(); 
        
        System.out.println("출력 완료");
         
    } 

}
