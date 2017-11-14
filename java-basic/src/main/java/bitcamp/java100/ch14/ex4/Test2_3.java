// 데이타 프로세싱 스트림 클래스 사용

package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_3 {
    
    public static void main(String[] args) throws Exception {
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test3.dat"));
        
        // serialization(인스턴스 변수의 값을 바이트 배열로 만들어 출력
        // 출력데이터 = 클래스 정보 + 인스턴스 변수의 값
        Score4 s = (Score4)in.readObject(); 
        
        in.close(); 
        
        System.out.println(s);
        
        s.compute();
        
        System.out.println(s);         
         
    } 

}
