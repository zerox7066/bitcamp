package bitcamp.java100.ch09.ex4;

public class LinkedList {
    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        Box box = new Box();
        box.value = value;
        
        if (head == null) {
            head = box;
            tail = box;
        } else {
            tail.next = box;
            tail = box;
        }
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object get(int index) {
        if (index < 0 || index >= len) 
            return null;
        
        Box box = head;
        
        if (index == 0) {
            return box.value;
        }
        
        for (int i = 0; i < index; i++){
            box = box.next;
        }
        return box.value;
    }
}
