package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Prompts {
    
    static Scanner keyScan;
    
    // 스태틱 블록
    static {
        keyScan = new Scanner(System.in);
    }
    
    // 인스턴스 변수가 없으므로 스태틱 메서드로 만듬
    static String inputString(String message) {
        System.out.println(message);
        return keyScan.nextLine();
    }

    static int inputInt(String message) {
        System.out.println(message);
        return Integer.parseInt(keyScan.nextLine());
    }

    
    static boolean confirm(String message) {
        System.out.println(message);
        String response = keyScan.nextLine().trim().toLowerCase();

        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }

}
