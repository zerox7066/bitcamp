//: ## 메서드(Method) - call by value 와 call by reference

package bitcamp.java100;

public class Test17_14 {
    // call by value : 호출할 때 값을 넘김
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
    }
    
    // call by reference : 호출할 때 주소를 넘김
    static void swap2(int[] r) {
        int temp = r[0];
        r[0] = r[1];
        r[1] = temp;
        System.out.println(r);
        //System.out.printf("r memory: r = %d\n", r);
        System.out.printf("swap2(): r[0] = %d, r[1] = %d\n", r[0], r[1]);
        System.out.println("--------------------------------------------------");
    }
    
    // entry point
    public static void main(String[] args) {
        // call by value : 호출할 때 값을 넘김
        int a = 5;  // local 변수는 Stack 메모리에 생성
        int b = 7;
        
        swap(a, b);
        System.out.printf("main(): a = %d, b = %d\n", a, b);
        System.out.println("--------------------------------------------------");
        
        // call by reference
        int[] arr = new int[2];  // new를 사용하면 Heap 메모리에 생성
        arr[0] = 5;
        arr[1] = 7;
        
        swap2(arr);
        System.out.println(arr);
        //System.out.printf("arr memory: arr = %d\n", arr);
        System.out.printf("main(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
        System.out.println("--------------------------------------------------");
        
    }
}






















