package bitcamp.java100.ch07.ex5;

public class A {
    // 생성자 : 인스턴스를 사용 가능하도록 유효한 상태로 만드는 것
    // 변수의 초기값 설정고 ㅏ배열으 초기상태을 만들기 위해서 사용
    /*
    A() {
        // Super Class의 기본 생성자를 호출
        // A 클래스의 Super Class는 Object의 기본 생성자를 호출
        super();
    }
    */
    
    A() {
        // 컴파일러가 Super Class의 생성자를 자동 호출
        // super();
        
        System.out.println("A() 생성자 실행.");
    }
    
    A(String str) {
        super();
        
        System.out.println("A(String) 생성자 실행.");
    }
    
    A(int i) {
        System.out.println("A(int) 생성자 실행.");
        
        //super();  //첫 번째 문장이 아니면 컴파일 오륜
    }
    
}
