
package bitcamp.java100.ch09.ex6;

public class ScoreStack {
    
    // non-static nested class => inner class 
    private class Box {
        Score value;
        Box next;
        
        // 기본 생성자
        public Box() {}
        
        public Box(Score value){
            this.value = value;
        }
    }
    
    Box top;
    
    // 전체 상자 개수
    int len;
    
    public void push(Score value) { 
        Box box = new Box(value);
        
        box.next = top;
        
        top = box;
        
        len++;
    }
    
    public int size() {
        return len;
    }
    
    public Score pop() {
        if (len == 0) 
            return null;
        
        Box box = top;
        top = top.next;
        
        len--;
        
        return box.value;
    }
}
