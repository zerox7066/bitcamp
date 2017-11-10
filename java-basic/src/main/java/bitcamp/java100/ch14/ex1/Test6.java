// File System : Directory

package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test6 {
    
    public static void main(String[] args) throws Exception {
        
        FilenameFilter filter;
        
        File file = new File(".");
        
        File[] files = file.listFiles(
            new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    
                    if (name.startsWith(".")) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        );
        
        for (File f : files) {
            System.out.printf("%s %10d %s %s\n",
                    f.isDirectory() ? "d" : "-",
                    f.length(),
                    new Date(f.lastModified()).toString(),
                    f.getName()
                    );
        }
    }

}

//중첩 > 로컬 > 익명(인터페이스, 수퍼클래스 생성자) > 익명클래스를 함수안에 추가
