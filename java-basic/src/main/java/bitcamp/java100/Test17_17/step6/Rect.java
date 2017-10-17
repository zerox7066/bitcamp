package bitcamp.java100.Test17_17.step6;

public class Rect {
    int width;
    int height;

    // 인스턴스 메서드
    // 1) static 키워드를 제거
    // 2) this(내장변수)를 사용
    float area() {
        return (this.width * this.height) / 10000f;
    }
    
    float pyeong() {
        return (this.width * this.height) / 10000f / 3.3f;
    }
}