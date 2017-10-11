// ## 연산자 - 비트 연산자 활용
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test15_11_3 {
    public static void main(String[] args) {
        // 파일의 정보 저장
        // 디렉토리여부, 소유주/그룹/기타 사용자의 읽기 쓰기, 실행 권한 정보
        int p1 = 0;
        p1 = 0b0_111_101_101;
        
        final int DIRECTORY = 0x0200;  //Ob0010_0000_0000;
        final int OWNER_READ = 0x0100;  //Ob0001_0000_0000;
        final int OWNER_WRITE = 0x0080;  //Ob0000_1000_0000;
        final int OWNER_EXE = 0x0040;  //Ob0000_0100_0000;
        final int GROUP_READ = 0x0020;  //Ob0000_0010_0000;
        final int GROUP_WRITE = 0x0010;  //Ob0000_0001_0000;
        final int GROUP_EXE = 0x0008;  //Ob0000_0000_1000;
        final int OTHER_READ = 0x0004;  //Ob0000_0000_0100;
        final int OTHER_WRITE = 0x0002;  //Ob0000_0000_0010;
        final int OTHER_EXE = 0x0001;  //Ob0000_0000_0001;
        
        // => 메모리 주소 : 레퍼런스
        System.out.print((p1 & DIRECTORY) == DIRECTORY ? "d" : "-");
        System.out.print((p1 & OWNER_READ) == OWNER_READ ? "r" : "-");
        System.out.print((p1 & OWNER_WRITE) == OWNER_WRITE ? "w" : "-");
        System.out.print((p1 & OWNER_EXE) == OWNER_EXE ? "x" : "-");
        System.out.print((p1 & GROUP_READ) == GROUP_READ ? "r" : "-");
        System.out.print((p1 & GROUP_WRITE) == GROUP_WRITE ? "w" : "-");
        System.out.print((p1 & GROUP_EXE) == GROUP_EXE ? "x" : "-");
        System.out.print((p1 & OTHER_READ) == OTHER_READ ? "r" : "-");
        System.out.print((p1 & OTHER_WRITE) == OTHER_WRITE ? "w" : "-");
        System.out.print((p1 & OTHER_EXE) == OTHER_EXE ? "x" : "-");
    }
}