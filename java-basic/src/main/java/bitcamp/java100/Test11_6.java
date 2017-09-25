// # 자바에서 값 표현(Literal) 하기

package bitcamp.java100;

public class Test11_6 {
    public static void main( String[] args ) {

        System.out.println(-21_4748_3648);  // 4Byte 최대값
        System.out.println(21_4748_3647);
        
        //System.out.println(-21_4748_3649);
        //System.out.println(21_4748_3648);

        System.out.println(-21_4748_3649L);  // 대문자 L을 사용
        System.out.println(21_4748_3648l);

        System.out.println(10);  // 4Byte 정수값
        System.out.println(10L);  // 8Byte 정수값
        
        System.out.println(-922_3372_0368_5477_5808L);  // 8Byte 최대값
        System.out.println(922_3372_0368_5477_5807L);  
        
    }
}
