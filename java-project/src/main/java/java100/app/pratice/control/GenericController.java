package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

// 추상 클래스
public abstract class GenericController<T> {
    static Scanner keyScan = new Scanner(System.in);

    protected ArrayList<T> list = new ArrayList<>();
    
    // 메서드 규격을 "메서드 시그너처(method signature)" 라 부른다.
    // C/C++ 에서는 메서드 규격을 "함수 프로토타입(function prototype)" 이라 부른다.
    public abstract void execute();
}

