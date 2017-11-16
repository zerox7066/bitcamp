// ## 메서드 - 메서드 정의 문법 I
// - 메서드 정의 기본 문법을 알아 보자!
//

package bitcamp.java100.ch03;

public class Test17_2 {

    // 메서드를 정의하는 문법
    // - 리턴할_데이터의_타입 메서드명(파라미터, 파라미터, ...) { 명령어들 }
    //
    // 리턴할_데이터의_타입?
    // - 메서드에서 작업을 수행한 후 호출한 쪽에 리턴하는 데이터의 타입이다.
    // 
    // 파라미터?
    // - 메서드를 실행할 때 값을 호출한 쪽으로부터 넘어온 값을 받는 변수이다. 
    // 
    
    // 1) 리턴 값과 파라미터가 없는 메서드
    // void => 값을 리턴하지 않음을 표시한다.
    // () => 값을 받지 않는 경우 괄호() 안에 변수를 선언하지 않는다.
    // 
    static void m1() {
        System.out.println("m1() 메서드 실행됨!");
    }
    
    public static void main(String[] args) {
        // 정의한 메서드를 사용하는 방법
        // => 메서드를 사용하는 것을 "메서드를 호출한다"라고 표현한다.
        // => 메서드를 호출하면 해당 메서드 블록으로 가서 그 블록 안에 코드를 실행한 후 
        //    다시 호출한 쪽으로 돌아온다.
        m1(); 
        
        // 메서드 블록 안의 코드를 실행시키고 싶다면 언제든지 호출하면 된다.
        m1(); // 해당 메서드 블록으로 가서 실행하고 되돌아 온다.
        m1(); // 해당 메서드 블록으로 가서 실행하고 되돌아 온다.
        m1(); // 해당 메서드 블록으로 가서 실행하고 되돌아 온다.
        
        // 값을 받지 않는 메서드에 값을 주면 컴파일 오류이다.
        //m1(100);
        
        // 값을 리턴하지 않는 메서드로부터 값을 받으려 하면 컴파일 오류이다.
        //int r = m1();
        
        
    }
}














