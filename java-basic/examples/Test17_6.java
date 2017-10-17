//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_6 {
    // 여러개의 값을 반환
    // 배열과 컬렉션을 이용
    
    static int[] m1() {
        // 배열을 초기화 
        int[] values = {100, 90, 80};
        
        int[] values2;
        //values2 = {100, 90, 80};  // 컴파일 오류!
        values2 = new int[] {100, 90, 80};  // OK
                
        //return {100, 90, 80};
        
        //return new int[] {100, 90, 80};  // OK
        return values2;
        
        // 주의 : 배열의 주소가 리턴
        // primitive(byte, short, integer, long, float ...) type은 값을 리턴
    }
    
    public static void main(String[] args) {
        int[] arr = m1();
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("--------------------------------------------------");
    }
}














