
package java100.app;

import java.util.Scanner;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    static MemberController membeController = new MemberController();
    static BoardController boardController = new BoardController();
    
    public static void main(String[] args) {
        
        loop :
        while(true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");
            
            try{
                switch (input[0]) {
                case "menu": doMenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                case "go": doGo(input[1]); break;
                default: doError();
                }
            } catch (Exception e) {
                System.out.println("명령 처리중 에러가 발생했습니다.");
                e.printStackTrace();
            }
            
            System.out.println();
        }        
    }

    private static void doGo(String menuNo) {

        switch (menuNo) {
        case "1" : scoreController.execute(); break;
        case "2": membeController.excute();  break;
        case "3": boardController.excute(); break;
        default: 
            System.out.println("해당 메뉴가 없습니다.");
        }
    }
    
    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu     - 메뉴 목록 출력한다.");
        System.out.println("go 번호  - 메뉴로 이동한다.");
        System.out.println("quit     - 프로그램을 종료한다.");
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }
}