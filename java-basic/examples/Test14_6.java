// ## 레퍼런스 배열
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test14_6 {

    public static void main(String[] args) {
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
            int[][] arr1 = new int[2][2];

            // operator = method = message = function
            void compute() {
                sum = kor + eng + math;
                aver = sum / 3.0f;
            }
        }

        // int[] arr1 = new int[3];
        Score[] scores = new Score[3];

        for(int i = 0; i < scores.length; i++) {
            scores[i] = new Score();
        }

        //scores[0] = new Score();
        //scores[1] = new Score();
        //scores[2] = new Score();


        scores[0].name = "홍길동";
        scores[0].kor = 90;
        scores[0].eng = 80;
        scores[0].math = 70;
        scores[0].compute();
        scores[0].arr1[0][0] =  7;
        scores[0].arr1[0][1] =  77;
        scores[0].arr1[1][0] =  777;
        scores[0].arr1[1][1] =  7777;
        
        scores[1].name = "임꺽정";
        scores[1].kor = 90;
        scores[1].eng = 80;
        scores[1].math = 70;
        scores[1].compute();
        scores[1].arr1[0][0] =  8;
        scores[1].arr1[0][1] =  88;
        scores[1].arr1[1][0] =  888;
        scores[1].arr1[1][1] =  8888;
        
        scores[2].name = "유관순";
        scores[2].kor = 100;
        scores[2].eng = 100;
        scores[2].math = 100;
        scores[2].compute();
        scores[2].arr1[0][0] =  9;
        scores[2].arr1[0][1] =  99;
        scores[2].arr1[1][0] =  999;
        scores[2].arr1[1][1] =  9999;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].arr1.length; j++) {
                for (int k = 0; k < scores[i].arr1[j].length; k++) {
                    System.out.printf("%4s, %4d, %4d, %4d, %4d, %5.1f, %-4d\n",
                    scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver, scores[i].arr1[j][k]);
                }
            }
        }
    }
}