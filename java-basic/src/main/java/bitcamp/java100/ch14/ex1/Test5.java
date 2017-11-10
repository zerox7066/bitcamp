// File System : Directory

package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5 {
    
    public static void main(String[] args) throws Exception {
        
        FilenameFilter filter;
        
        File file = new File(".");
        
        String[] filesnames = file.list(
            new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    
                    if (name.startsWith(".")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        );
        
        for (String name : filesnames) {
            System.out.println(name);
        }
    }

}

//중첩 > 로컬 > 익명(인터페이스, 수퍼클래스 생성자) > 익명클래스를 함수안에 추가
