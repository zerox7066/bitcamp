package java100.app.control;

// 이 규칙은 App 클래스가 컨트롤러 객체를 사용하기 위해 
// 호출하는 메서드를 선언한 것이다.
//
public interface Controller {
    /*public abstract*/ void execute();
    
    default void init() { }
    
    // 프로그램을 종료하기 전에 객체에게 마무리 작업을 시키는 메서드
    default void destroy() {}

}








