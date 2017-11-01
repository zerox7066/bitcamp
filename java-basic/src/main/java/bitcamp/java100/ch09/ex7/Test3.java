// 컬렉션 API - HashSet

package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test3 {
    
    public static void main(String[] args) {
        
        // 여러 개의 객체를 저장할 컬렉션을 준비
        HashSet<String> set = new HashSet<>();
        
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
                
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        // HashSet은 집합특성이 있어서 인스턴스를 중복 저장 안됨
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        // HashSet은 null 값 저장할 수 있다.
        set.add(null);
        set.add(null);

        System.out.println(set.size());
        
        String[] arr = new String[set.size()];
        String[] arr2 = set.toArray(arr);
        
        if (arr == arr2)
            System.out.println("arr == arr2");
        else
            System.out.println("arr != arr2");
        
        for (String s : arr){
            System.out.printf("%s ", s);
        }
        
        System.out.println();
        System.out.println("-----------------------------------------------");

        for (String s : arr2){
            System.out.printf("%s ", s);
        }
        
        // 해시 값으로 저장하면 중복 제거 및 빨리 검색할 수 있다.
    }

}
