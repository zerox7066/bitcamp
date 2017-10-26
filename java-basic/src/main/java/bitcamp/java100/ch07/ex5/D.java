package bitcamp.java100.ch07.ex5;

public class D extends C {
    /*
    D() {
        super();
    }*/
    
    D() {
        // 수퍼 클래스 C에 기본 생성자가 없기 때문에
        // 수퍼 클래스에 존재하는 생성자를 호출하도록 명시적으로 작성해야 한다.
        super("hi");
        
        //super();
    }

}
