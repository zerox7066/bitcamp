package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

 
public abstract class GenericController<T> implements Controller {
    
    // 컨트롤러 클래스들이 공통으로 사용하는 객체를 선언한다.
    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>();
    
    //public abstract void execute();
    
}









