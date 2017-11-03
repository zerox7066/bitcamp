//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 
package java100.app;
import java.util.Scanner;

public class Member {  
    
    protected String name;    
    protected String email;    
    protected String password;
    
    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Member() {
    }
    
    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("이메일? ");
        this.email = keyScan.nextLine();
        
        System.out.print("암호? ");
        this.password = keyScan.nextLine();
        
        System.out.println();
    
    //: > 전체 공개할 메서드는 public으로 선언한다. 
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("이름?(%s) ", this.name);
        String name = this.name;
        try { 
            name = keyScan.nextLine();
            if (name.isEmpty()) name = this.name;
        } catch(Exception e) {}
        
        System.out.printf("암호?(%s) ", this.password);
        String password = this.password;
        try {
            password = keyScan.nextLine();
            if (password.isEmpty()) password = this.password;
        } catch(Exception e) {}
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.name = name;
            this.password = password;
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }
    
    static boolean confirm2(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if (response.equals("n") || 
                response.equals("no") || 
                response.equals("")) {
            return false;
        }
        return true;
    }
    
    public void print() {
        System.out.printf("%-4s, %s, %4s\n",  
                this.name, 
                this.email, 
                this.password);
    }
    
    public void printDetail() {
        System.out.printf("%-4s, %s, %4s\n",  
                this.name,
                this.email, 
                this.password);
    }
}
