// File System : 하위 폴더

package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.util.ArrayList;

public class Test9 {
    
    static ArrayList<File> fileList = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        
        File file = new File(".");
        
        fileList.add(file);
        
        while (fileList.size() > 0) {
            printFiles(fileList.remove(0));
        }  
    }
    
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();

        for (File f : files) {
            System.out.println(f.getCanonicalPath());
            
            if (f.isDirectory()) {
                fileList.add(f);
            }
        }
    }

}

//중첩 > 로컬 > 익명(인터페이스, 수퍼클래스 생성자) > 익명클래스를 함수안에 추가
