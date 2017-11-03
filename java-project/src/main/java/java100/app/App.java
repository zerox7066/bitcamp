package java100.app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    static ArrayList<Score> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.print("이름? ");
            String name = keyScan.nextLine();

            System.out.print("국어? ");
            int kor = Integer.parseInt(keyScan.nextLine());

            System.out.print("영어? ");
            int eng = Integer.parseInt(keyScan.nextLine());

            System.out.print("수학? ");
            int math = Integer.parseInt(keyScan.nextLine());

            Score score = new Score();
            score.name = name;
            score.kor = kor;
            score.eng = eng;
            score.math = math;
            
            score.compute();
            
            list.add(score);
            
            if (confirm("입력을 중지하시겠습니까? ")) {
                break;
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static boolean confirm(String message) {
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase().trim();
        
        if (response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
    }

}
