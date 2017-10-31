// Box를 이용하여 여러 개의 값을 보관하고 꺼내는 일을 한다.

package bitcamp.java100.ch09.ex3;

import bitcamp.java100.ch09.ex4.Box;

public class LinkedList {
    
    // non-static nested class => inner class 
    private class Box {
        Object value;
        Box next;
    }

    // 시작 상자와 끝 상자의 위치
    Box head;
    Box tail;
    
    // 전체 상자 개수
    int len;
    
    public void add(Object value) {
        Box box = new Box();
        
        box.value = value;
        
        if (tail == null) {
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
    
    public void insert(int index, Object value) {
        if ( index < 0 || index > len - 1) {
            return;
        }
        
        len++;
        
        Box box = new Box();
        box.value = value;
        
        Box pre = head;
        
        if (index == 0) {
            box.next = pre;
            head = box;
            return;
        }
        
        for (int i = 0; i < index - 1 ; i++) {
            System.out.println("index1");
            pre = pre.next;
        }
        box.next = pre.next;
        pre.next = box;
    }
    
    public Object remove(int index) {
        if (index < 0 || index > len - 1)
            return null;
        
        len--;
        
        Box removedBox = new Box();
        
        if (index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }
        
        Box pre = head;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        removedBox = pre.next;
        pre.next = removedBox.next;
        
        if (index == len - 1){
            tail = pre;
        }
        
        return removedBox.value;
    }
}
