// 인터페이스를 정의하는 방법

package bitcamp.java100.ch12.ex3;

// 인터페이스도 필드를 가질 수 있다.
public interface Protocol2 {
    // 모든 메서드 필드은 공개
    // 값은 변경할 수 없다. 필드는 상수로 정의
    public static final float PI = 3.14159f;
    
    static final int AA = 100;
    
    final int BB = 200;
    
    int CC = 300;

    // 생략하면 컴파일러가 public static final을 붙인다.
    // public static final int CC = 300;
    
    //private int DD = 400;  // 컴파일 오류!
}
