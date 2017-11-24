//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 
package java100.app.domain;

public class Score {  
    
    protected int no;
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected float aver;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Score() {}
    
    public Score(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    @Override
    public String toString() {
        return "Score [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
                + sum + ", aver=" + aver + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }

    private void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
}
