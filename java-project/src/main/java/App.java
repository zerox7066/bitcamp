// ver 05
// 클래스 문법 응용


// ver 04

// 출력내용
// 홍길동, 100,  90,  80, 270,  90.0
// 임꺽정,  80,  90,  80, 240,  80.0
// 유관순, 100, 100, 100, 300, 100.0

// ver 03
// 변수를 이용하여 이름, 국어, 영어, 수학 총점, 합계를 저장하라! 그런 후 다음과 같이 출력하라.
// - 이름, 국어, 영어, 수학, 총점, 평균
//   출력 결과)
//   이름: 홍길동
//   국어: 100
//   영어: 100
//   수학: 100
//   총점: 300
//   평균: 100.0


// ver 02
// - 학생 한 명의 성적 점수를 출력하라!
// - 이름, 국어, 영어, 수학, 총점, 평균
//   출력 결과)
//   이름: 홍길동
//   국어: 100
//   영어: 100
//   수학: 100
//   총점: 300
//   평균: 100.0
//
// ver 01
// - 표준 출력장치로 인사문구 출력하라!
// 
// 
// ver-01
// - 표준 출력장치로 인사문구 출력하기


// 출력내용
// 홍길동, 100,  90,  80, 270,  90.0
// 임꺽정,  80,  90,  80, 240,  80.0
// 유관순, 100, 100, 100, 300, 100.0
public class App {

    public static void main(String[] args) {
        // 사용자 정의 데이터 타입
        // 데이타 저장할 메모리 설계
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
        
        // 데이타 저장할 메모리 준비
        /*
        Score[] scores = new Score[3];
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();
        */
        
        Score[] scores = {new Score(), new Score(), new Score()};
        
        //Score[] scores = new Score[3];
        
        
        //Score s1 = new Score();
        scores[0].name = "홍길동";
        scores[0].subjects[0] = 100;
        scores[0].subjects[1] = 90;
        scores[0].subjects[2] = 80;
        for (int sub : scores[0].subjects) {
            scores[0].sum += sub;
        }
        scores[0].aver = scores[0].sum / 3f;
        
        //Score s2 = new Score();
        scores[1].name = "임꺽정";
        scores[1].subjects[0] = 80;
        scores[1].subjects[1] = 90;
        scores[1].subjects[2] = 80;
        for (int sub : scores[1].subjects) {
            scores[1].sum += sub;
        }
        scores[1].aver = scores[1].sum / 3f;
        
        //Score s3 = new Score();
        scores[2].name = "유관순";
        scores[2].subjects[0] = 100;
        scores[2].subjects[1] = 100;
        scores[2].subjects[2] = 100;
        for (int sub : scores[2].subjects) {
            scores[2].sum += sub;
        }
        scores[2].aver = scores[2].sum / 3f;
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
                scores[0].name, scores[0].subjects[0], scores[0].subjects[1], scores[0].subjects[2], scores[0].sum, scores[0].aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
                scores[1].name, scores[1].subjects[0], scores[1].subjects[1], scores[1].subjects[2], scores[1].sum, scores[1].aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
                scores[2].name, scores[2].subjects[0], scores[2].subjects[1], scores[2].subjects[2], scores[2].sum, scores[2].aver);
    }
}