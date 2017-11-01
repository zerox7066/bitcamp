// Queue : FIFO

package bitcamp.java100.ch09.ex5;

public class Queue {
    
    // non-static nested class => inner class 
    private class Box {
        Object value;
        Box next;
        
        // 기본 생성자
        public Box() {}
        
        public Box(Object value){
            this.value = value;
        }
    }
    
    Box head;
    Box tail;
    
    // 전체 상자 개수
    int len;
    
    public void add(Object value) { 
        Box box = new Box(value);
        
        if (tail != null)
            tail.next = box;
        
        tail = box;
        
        len++;
        
        if (head == null) {
            head = box;
            tail = box;
        }
    }
    
    public int size() {
        return len;
    }
    
    public Object poll() {
        if (len == 0) 
            return null;
        
        Box box = head;
        
        head = head.next;
        
        len--;
        
        return box.value;
    }
}
