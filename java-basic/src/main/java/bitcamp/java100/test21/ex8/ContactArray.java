package bitcamp.java100.test21.ex8;

public class ContactArray {
    // 레퍼런스 100개         객체 100(x)
    static Contact[] contacts = new Contact[100];

    static int cursor = 0;
    
    static void add(Contact contact) {
        if (cursor >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        
        contacts[cursor] = contact;
        cursor++;
    }
    
    static Contact get(int index) {
        if (index < 0 || index >= cursor)
            throw new RuntimeException("유효하지 않은 인덱스");
        
        return contacts[index];
    }
    
    static int size() {
        return cursor;
    }

}
