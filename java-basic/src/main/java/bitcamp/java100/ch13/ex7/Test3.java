// throw를 이용

package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test3 {
    
    // 타입 나열할 때 순서는 상관없다.
    static void m1(int i) throws RuntimeException, Error, ArithmeticException, IndexOutOfBoundsException {
        switch (i) {
        case 1: throw new RuntimeException();
        case 2: throw new Error();
        case 3: throw new ArithmeticException();
        case 4: throw new IndexOutOfBoundsException();
        }
    }
    
    // Error, RuntimeException 계열은 타입 생략 가능
    static void m2(int i) {
        switch (i) {
        case 1: throw new RuntimeException();
        case 2: throw new Error();
        case 3: throw new ArithmeticException();
        case 4: throw new IndexOutOfBoundsException();
        }
    }
    
    public static void main(String[] args) throws IOException, Exception {
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
