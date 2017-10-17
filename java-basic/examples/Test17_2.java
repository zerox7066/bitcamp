//: ## 메서드(Method) - 기본 메서드 정의

package bitcamp.java100;

public class Test17_2 {
    
    static void m1() {
        System.out.println("m1() 메서드 실행됨!");
    }

    public static void main(String[] args) {
        // 호출하는 방법        
        m1();
        
//        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
//        list.add("One");
//        list.add("Two");
//        System.out.println(list.size());
//        
//        list.remove("Two");
//        System.out.println(list.size());
//        
//        list.add("Two");
//        
//        list.add(1, "1.5");
//        
//        System.out.println(list);
        
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
        list.add(1);
        list.add(2);
        
        System.out.println(list);
        
    }
}














