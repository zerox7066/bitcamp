// hashCode 오버라이딩

package bitcamp.java100.ch08.ex6;

public class Score2 {
    protected int no;
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected float aver;

    public Score2() {
    }

    public Score2(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
    }
    
    // 수퍼 클래스 Object에서 상속 받은 toString()을 재정의
    // overriding
//    public String toString() {
//        return String.format("[%d, %s, %d, %d, %d, %d %f]", 
//                this.no, this.name, this.kor, this.eng, this.math, this.sum, this.aver);
//    }


    @Override
    // 인스턴스 값 확인
    public String toString() {
        return "Score [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
                + sum + ", aver=" + aver + "]";
    }

    @Override
    // 인스턴스의 내용값이 같은지 확인
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + eng;
        result = prime * result + kor;
        result = prime * result + math;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + no;
        return result;
    }

    @Override
    // 인스턴스의 내용값이 같은지 확인
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Score2 other = (Score2) obj;
        if (eng != other.eng)
            return false;
        if (kor != other.kor)
            return false;
        if (math != other.math)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no != other.no)
            return false;
        return true;
    }
    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAver(float aver) {
        this.aver = aver;
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

    protected void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

}
