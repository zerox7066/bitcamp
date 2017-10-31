package bitcamp.java100.ch09.ex4;

public class Test {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
    }

}
