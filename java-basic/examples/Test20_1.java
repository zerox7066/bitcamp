// ## 래퍼(wrapper) 클래스 사용법 - 래퍼 클래스의 소개

package bitcamp.java100;

public class Test20_1 {
    
    // entry point
    public static void main(String[] args) {
        // primitive type 변수
        int i =10;
        
        Integer i2 = new Integer(10);

        int i3 = i2.intValue();
        
        float f1 = i2.floatValue();
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        int value = Integer.parseInt("2345");
        System.out.println(value + 100);
        
        System.out.println(Integer.toBinaryString(44036));
        System.out.println(Integer.toOctalString(44036));
        System.out.println(Integer.toHexString(44036));
        
        
        System.out.println("--------------------------------------------------");
    }
}






















