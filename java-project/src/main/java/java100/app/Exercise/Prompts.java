package java100.app;

import java.util.Scanner;

public class Prompts {
    static Scanner keyScan = new Scanner(System.in);
    
    // 인스턴스 변수를 사용하지 않기 때문에 클래스 메서드로 둔다.
    public static String input(String message) {
        System.out.println();
        System.out.print(message);
        return keyScan.nextLine();
    }
    
    public static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("y") || 
                response.equals("yes") || 
                response.equals("")) {
            return true;
        }
        return false;
    }
    
    public static boolean confirm2(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("n") || 
                response.equals("no") || 
                response.equals("")) {
            return false;
        }
        return true;
    }
}
