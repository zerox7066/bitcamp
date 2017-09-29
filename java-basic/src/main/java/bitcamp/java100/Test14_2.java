// ## 사용자 정의 데이터 타입
// Class 사용자 정의 변수를 정의해서 사용하고, 메소드를 분류하는 용도

package bitcamp.java100;

public class Test14_2 {

    public static void main(String[] args) {
        class BookInfo {
            String title;
            String author;
            String company;
            int pageSize;
            double price;
        }

        BookInfo bookInfo;
        bookInfo = new BookInfo();

        bookInfo.title = "자바 정석";
        bookInfo.author = "홍길동";
        bookInfo.company = "비트캠프";
        bookInfo.pageSize = 300;
        bookInfo.price = 30.5;

        System.out.printf("%s, %s, %s, %d, %.2f\n",
        bookInfo.title, bookInfo.author, bookInfo.company, bookInfo.pageSize, bookInfo.price);
    }
}