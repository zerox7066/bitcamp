// 클래스의 용도

public class Score {
    // 메모리 설계도
    String name;
    int[] subjects = new int[3];
    int sum;
    float aver;

    // Score 메모리의 값을 다루는 메서드는 Score 클래스 분류
    static void init(Score score, String name, int kor, int eng, int math) {
        score.name = name;
        score.subjects[0] = kor;
        score.subjects[1] = eng;
        score.subjects[2] = math;
        
        compute(score);
    }
    
    static void compute(Score score) {
        for (int sub : score.subjects) {
            score.sum += sub;
        }
        score.aver = score.sum / 3f;
    }
    
    static void print(Score s) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                s.name, 
                s.subjects[0], 
                s.subjects[1], 
                s.subjects[2], 
                s.sum, 
                s.aver);
    }
}
