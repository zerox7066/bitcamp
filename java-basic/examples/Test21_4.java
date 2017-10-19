// ## 키보드로부터 입력 받기(scanner)

package bitcamp.java100;

import java.io.Console;

public class Test21_4 {
    
    // entry point
    public static void main(String[] args) {
        class Student {
            String name;
            int age;
            boolean working;
            float gpa;
        }
        
        Student s = new Student(); 
        
        Console console = System.console();
        
        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);   // JVM 종료
        }
        
        
        System.out.println("--------------------------------------------------");
        
        s.name = console.readLine("이름? ");
        s.age = Integer.parseInt(console.readLine("나이? "));
        s.working = Boolean.parseBoolean(console.readLine("재직여부? "));
        s.gpa = Float.parseFloat(console.readLine("졸업학점? "));
        
        System.out.println("--------------------------------------------------");
        
        System.out.printf("이름: %s\n", s.name);
        System.out.printf("나이: %d\n", s.age);
        System.out.printf("재직여부: %b\n", s.working);
        System.out.printf("졸업학점: %.2f\n", s.gpa);
        
        System.out.println("--------------------------------------------------");
    }
}






















