// File System : 하위 폴더

package bitcamp.java100.ch14.ex1;

import java.util.Scanner;

public class Test8_4 {

    static Scanner keyScan = new Scanner(System.in);
    
    static int f(int n) {
        
        if (n == 0)
            return 0;
        return n + f(n - 1);
    }
    
    public static void main(String[] args) throws Exception {
        int sum = f(100000);
        
        System.out.println(sum);
    }

}
