package bitcamp.java100.ch06.ex6;

public class Car3 {
    // 모든 차량이 공유하는 변수는 스택틱 변수로 선언해야 한다.
    
    // 특정값을 정의하는 상수는 대문자로 정의
    // final은 값을 변경할 수 없다.    
    public final static int TYPE_TRUCK = 1;
    public final static int TYPE_SEDAN = 2;
    public final static int TYPE_BUS = 3;
    
    public final static int USE_PRIVATE = 1;
    public final static int USE_COMPANY = 2;
    public final static int USE_COMMERCIAL = 3;
    
    // 모든 차량이 공유하는 변수
    static int count;
    
    long no;
    String model;
    int cc;
    int type;  // 트럭 = 1, 승용 = 2, 승합 = 3
    int use;   // 개인 = 1, 법인 = 2, 영업 = 3
    
    // 생성자
    Car3(String model, int cc, int type, int use) {
        // static 변수는 this을 붙여도 되나 굳이 붙일 필요가 없다.
        count++;
        
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis();
        this.type = type;
        this.use = use;
        
        // 고유번호 생성을 위해 실행시간 지연
        try {
            Thread.currentThread().sleep(50);
        } catch(Exception e) {}
    }
}
