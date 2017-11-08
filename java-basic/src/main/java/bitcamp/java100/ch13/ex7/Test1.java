// throw를 이용

package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {

    static void m1(int i) throws Throwable {
        if (i < 0) {
            throw new Throwable();
        }
    }
    
    // 타입 나열할 때 순서는 상관없다.
    static void m2(int i) throws Exception, SQLException,
            IOException, FileNotFoundException {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    static void m3(int i) throws Exception {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    static void m4(int i) throws Throwable {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    // Object는 컴파일 오류
    /*static void m5(int i) throws Object {   
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }*/
    
    // Throwable 타입이 아닌경우 컴파일 오류
    /*static void m6(int i) throws String {   
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        case 5: throw new String();
        }
    }*/
    
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("입력> ");
        String str = keyScan.nextLine().toLowerCase();
        
        try {
            System.out.println("try 블록 실행");
        } finally {
            // catch 블록 없이 사용할 수 있다.
            // 사용한 자원을 해제할 때 사용
            System.out.println("finally 블록 실행");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
