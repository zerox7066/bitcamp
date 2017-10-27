// 캡슐화의 존재 이유 - 필드와 프로퍼티, 그리고 셋터/겟터

package bitcamp.java100.ch08.ex1;

class Member3 {
    // 클래스에 선언된 스태틱 변수 또는 인스턴스 변수를 필드라고 부른다.
    private String name;
    private int age;
    private float weight;
    private float height;
    
    // 필드의 다루는 메서드를 setter, getter => read, write property
    // 필드는 프로퍼티가 아니다.
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

public class Test7_3 {

    public static void main(String[] args) {
        Member3 m = new Member3();
        //m.name = "홍길동";
        //m.age = 20;
        //m.weight = 900.7f;
        //m.height = 16.0f;        
        
        m.setName("홍길동");
        m.setAge(300);
        m.setWeight(500);
        m.setHeight(-200);
        
        System.out.printf("%s, %d, %f, %f\n",
                m.getName(), m.getAge(), m.getWeight(), m.getHeight());
    }
}
