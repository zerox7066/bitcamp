package java100.app;

import java.sql.Date;
import java.util.Scanner;

public class Board {
    protected int no;
    protected String title;
    protected String content;
    protected Date regDate;
    protected int viewCount;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Board() {
    }
    
    public Board(int no, String title, String content) {
        this.no = no;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
    }

    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("번호? ");
        this.no = Integer.parseInt(keyScan.nextLine());
        
        System.out.print("제목? ");
        this.title = keyScan.nextLine();
        
        System.out.print("내용? ");
        this.content = keyScan.nextLine();

        this.regDate = new Date(System.currentTimeMillis());
        
        System.out.println(); 
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("제목?(%s) ", this.title);
        String title = keyScan.nextLine();
        try {
            if (title.isEmpty()) {
                this.title = title; 
            }
        } catch(Exception e) {}
        
        System.out.printf("내용?(%s) ", this.content);
        String content = keyScan.nextLine();
        try {
            this.content = content; 
        } catch(Exception e) {}        
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            this.regDate = new Date(System.currentTimeMillis());
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }
    
    public void print() {
        System.out.printf("%d, %s, %s, %d\n",  
                this.no, 
                this.title,
                this.regDate.toString(),
                this.viewCount);
    }
    
    public void printDetail() {
        System.out.printf("제목 : %s\n", this.title);
        System.out.printf("내용 : %s\n", this.content);
        System.out.printf("등록일 : %s\n", this.regDate.toString());
        System.out.printf("조회수 : %d\n", this.viewCount);
    }
}
