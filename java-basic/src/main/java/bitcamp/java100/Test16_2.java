// ## 문장(Statement) - 조건문 if
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test16_2 {
    public static void main(String[] args) {
        int age = 27;
        
        if (age <= 19) System.out.println("미성년");
        else System.out.println("성년");
        
        age = 17;
        if (age <= 19)
            System.out.println("미성년");
        else
            System.out.println("성년");

        System.out.println("-----------------------------------");
        age = 67;
        if (age >= 65)
            System.out.println("경로우대 대상자입니다.");
        
        age = 57;
        /*  컴파일 오류!
        else
            System.out.println("경로우대 대상자가 아닙니다.");
        */
        
        System.out.println("-----------------------------------");
        
        age = 27;
        if (age <= 19)
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인을 받을 수 있습니다.");
        
        System.out.println("-----------------------------------");

        //age = 17;
        if (age <= 19) {
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인을 받을 수 있습니다.");
        }
        
        System.out.println("-----------------------------------");

        age = 13;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");

        System.out.println("-----------------------------------");
        
        // 항상 else 가까운 if에 묶인다!!!
        age = 27;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
        else
            System.out.println("성년");

        System.out.println("-----------------------------------");
        
        // else를 사용할 경우 블록 사용
        age = 27;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
        }
        else
            System.out.println("성년");

        System.out.println("-----------------------------------");
        
        // if ~ else 문은 한문장!!!
        age = 13;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");

        System.out.println("-----------------------------------");
        
        // 들여쓰기해도 첫 번째 if문과 연결
        age = 23;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
            else  // 들여쓰기해도 첫 번째 if문과 연결
                System.out.println("성년입니다.");

        System.out.println("-----------------------------------");

        // else 안에 if 두기
        age = 72;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        else
            if (age < 65)
                System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");

        System.out.println("-----------------------------------");

        // 코드의 가독성을 높이기 위해 블록 활용
        age = 72;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년");
            else
                System.out.println("어린이 또는 유아");
        } else {
            if (age < 65)
                System.out.println("성년입니다.");
            else
                System.out.println("노인입니다.");
        }

        System.out.println("-----------------------------------");
        
        // else 문 안에 if ~ else 넣기
        age = 72;
        
        if (age < 8)
            System.out.println("유아");
        else
            if (age < 14)
                System.out.println("어린이");
            else
                if (age < 20)
                    System.out.println("청소년");
                else
                    if(age < 65)
                        System.out.println("성년");
                    else
                        System.out.println("노인");

        System.out.println("-----------------------------------");

        // else 안에 if ~ else가 있을 경우
        // 자바에서는 if ~ else문만 있다.!!!!!
        // 가독성을 위해서 else if를 사용
        age = 72;
        
        if (age < 8)
            System.out.println("유아");
        else if (age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if(age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");

        System.out.println("-----------------------------------");

        // else 안에 if ~ else가 있을 경우
        // 자바에서는 if ~ else문만 있다.!!!!!
        // 가독성을 위해서 else if를 사용
        age = 72;
        
        if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("어린이");
        } else if (age < 20) {
            System.out.println("청소년");
        } else if(age < 65) {
            System.out.println("성년");
        } else {
            System.out.println("노인");
        }
    }
}