// 데이타 프로세싱 스트림 클래스 사용

package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_3 {
    
    public static void main(String[] args) throws Exception {
        Score4 s = new Score4("홍길동", 800, 900, 1000, 900);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test3.dat"));
        
        // serialization(인스턴스 변수의 값을 바이트 배열로 만들어 출력
        // 출력데이터 = 클래스 정보 + 인스턴스 변수의 값
        out.writeObject(s);
        
        
        out.close(); 
        
        System.out.println("출력");
         
    } 

}
