// 캡슐화의 존재 이유 - 멤버의 접근을 제한하기

package bitcamp.java100.ch08.ex1;

class Member2 {
    private String name;
    private int age;
    private float weight;
    private float height;
    
    // 필드의 다루는 메서드를 setter, getter
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        if(age <= 0 || age > 150) return;
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setWeight(float weight) {
        if(weight <= 0 || weight > 200) return;
        this.weight = weight;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public void setHeight(float height) {
        if (height <= 0 || height > 250) return;
        this.height = height;
    }
    
    public float getHeight() {
        return this.height;
    }
}

public class Test7_2 {

    public static void main(String[] args) {
        Member2 m = new Member2();
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
