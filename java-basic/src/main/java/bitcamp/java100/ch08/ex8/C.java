package bitcamp.java100.ch08.ex8;

public class C extends A {
    // 리턴 타입만 다른 메서드를 추가할 수 없다.
    // 오버로딩은 리턴 타입을 일치시켜야 한다.
    // 오버로딩은 파라미터 명은 상관없다.
    int m1(int a) {  // 컴파일 오류!
        System.out.println("int m1(int)");
    }
    

}
