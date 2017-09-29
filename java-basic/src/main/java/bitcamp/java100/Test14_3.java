// ## 사용자 정의 데이터 타입
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도
// 수강생 정보를 저장할 데이터 타입

package bitcamp.java100;

public class Test14_3 {

    public static void main(String[] args) {
        class StudentInfo {
            String name;
            boolean gender;
            String residentNumber;            
            String cellularNumber;
            String address;
            int age;
            float height;
        }

        StudentInfo studentInfo;
        studentInfo = new StudentInfo();

        studentInfo.name = "홍길동";
        studentInfo.gender = true;
        studentInfo.residentNumber = "170101-1234567";
        studentInfo.cellularNumber = "010-1111-1111";
        studentInfo.address = "서울시 강남구 비트캠프";
        studentInfo.age = 30;
        studentInfo.height = 180.5f;

        System.out.printf("%s, %b, %s, %s, %s, %d, %.1f\n",
        studentInfo.name, studentInfo.gender, studentInfo.residentNumber, studentInfo.cellularNumber, studentInfo.address, studentInfo.age, studentInfo.height);
    }
}