// 제네릭(Generic) 적용 전

package bitcamp.java100.ch09.ex6;

public class Test1 {
    
    public static void main(String[] args) {
        Stack contacts = new Stack();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));
        
        //contacts.push(new String("안중근"));
        //contacts.push(new Boolean(true));
        
        //Contact c = contacts.pop();  // 컴파일 오류!
        Contact c = (Contact)contacts.pop();
        
        // BookStack
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        // 다른 타입을 넣을수 없다.
        //bookStack.push(new String());  // 컴파일 오류
        
        // 형변환 필요 없다.
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        // ContactStack
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        // 다른 타입을 넣을수 없다.
        //contactStack.push(new String());  // 컴파일 오류
        
        // 형변환 필요 없다.
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        
        // ScoreStack
        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        // 다른 타입을 넣을수 없다.
        //scoreStack.push(new String());  // 컴파일 오류
        
        // 형변환 필요 없다.
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        Score s3 = scoreStack.pop();
        
        
        
        
        
        
        
        
        
        
        
       
    }

}
