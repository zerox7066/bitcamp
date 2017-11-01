// 제네릭(Generic) 적용 후
// 여러 타입의 객체를 다룰 수 있다.

package bitcamp.java100.ch09.ex6;

public class Test2 {
    
    public static void main(String[] args) {
        // 타입의 이름을 전달 (기본은 Object)
        Stack2<Contact> contacts = new Stack2<Contact>();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));
        
        
        //contacts.push(new String("안중근"));  // 컴파일 오류!
        //contacts.push(new Boolean(true));     // 컴파일 오류!
        
        Contact c1 = contacts.pop(); 
        Contact c2 = contacts.pop();
        
        // BookStack
        Stack2<Book> bookStack = new Stack2<>();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        // 다른 타입을 넣을수 없다.
        //bookStack.push(new String());  // 컴파일 오류
        
        // 형변환 필요 없다.
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        // ContactStack
        Stack2<Contact> contactStack = new Stack2<>();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        // 다른 타입을 넣을수 없다.
        //contactStack.push(new String());  // 컴파일 오류
        
        // 형변환 필요 없다.
        Contact c3 = contactStack.pop();
        Contact c4 = contactStack.pop();
        
        // ScoreStack
        Stack2<Score> scoreStack = new Stack2<>();
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
