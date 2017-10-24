package bitcamp.java100.ch06.ex6;

public class Car {
    // 모든 차량이 공유하는 변수
    static int count;
    
    long no;
    String model;
    int cc;
    
    // 생성자
    Car(String model, int cc) {
        // static 변수는 this을 붙여도 되나 굳이 붙일 필요가 없다.
        count++;
        
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis();
        
        // 고유번호 생성을 위해 실행시간 지연
        try {
            Thread.currentThread().sleep(50);
        } catch(Exception e) {}
    }
}
