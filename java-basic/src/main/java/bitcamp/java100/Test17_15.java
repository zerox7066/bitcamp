//: ## 메서드(Method) - reference return

package bitcamp.java100;

public class Test17_15 {
    // 로컬 변수의 생명주기
    static int m1() {
        int a = 100;
        int b = 200;
        int c = a + b;
        return c;
    }
    
    // 메서드에서 만든 배열의 생명주기
    // new 연산자를 통해 만든 배열은 Heap 영역에 존재
    static int[] m2() {
        // arr Stack 메모리   :    new int[3]  Heap 메모리
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        return arr;   // 배열의 주소를 리턴
    }
    
    // entry point
    public static void main(String[] args) {
        int r1 = m1();
        
        // 로컬 변수에 접근 불가
        //a = 300;  // 컴파일 오류!
        //b = 300;  // 컴파일 오류!
        //c = 300;  // 컴파일 오류!
        
        System.out.println(r1);
        
        System.out.println("--------------------------------------------------");
        
        int[] r2 = m2();
        
        for (int i : r2) {
            System.out.println(i);
        }
        
        System.out.println("--------------------------------------------------");
        
        
    }
}






















