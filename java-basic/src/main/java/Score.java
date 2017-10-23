
public class Score {
    static String name;
    static int kor;
    static int eng;
    static int math;
    static int sum;
    static float aver;
    
    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.sum = kor + eng + math;
        this.aver = this.sum / 3f;
        
        
    }
}
