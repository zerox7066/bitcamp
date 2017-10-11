// ## 연산자 - 비트 연산자 활용
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_11_1 {
    public static void main(String[] args) {
        // 파일의 정보 저장
        // 디렉토리여부, 소유주/그룹/기타 사용자의 읽기 쓰기, 실행 권한 정보
        class Privilege {
            boolean isDirectory;
            boolean ownerRead;
            boolean ownerWrite;
            boolean ownerExe;
            boolean groupRead;
            boolean groupWrite;
            boolean groupExe;
            boolean otherRead;
            boolean otherWrite;
            boolean otherExe;
        }
        Privilege p1 = new Privilege();
        
        // => 메모리 주소 : 레퍼런스
        p1.isDirectory = false;
        p1.ownerRead = true;
        p1.ownerWrite = true;
        p1.ownerExe = true;
        p1.groupRead = true;
        p1.groupWrite = false;
        p1.groupExe = true;
        p1.otherRead = true;
        p1.otherWrite = false;
        p1.otherExe = true;
        
        System.out.print(p1.isDirectory ? "d" : "-");
        System.out.print(p1.ownerRead ? "r" : "-");
        System.out.print(p1.ownerWrite ? "w" : "-");
        System.out.print(p1.ownerExe ? "x" : "-");
        System.out.print(p1.groupRead ? "r" : "-");
        System.out.print(p1.groupWrite ? "w" : "-");
        System.out.print(p1.groupExe ? "x" : "-");
        System.out.print(p1.otherRead ? "r" : "-");
        System.out.print(p1.otherWrite ? "w" : "-");
        System.out.print(p1.otherExe ? "x" : "-");
        System.out.print(p1.otherExe ? "x" : "-");
    }
}