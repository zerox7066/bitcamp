package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class MyFileNameFilter implements FilenameFilter {
    
    @Override
    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        
        if (file.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }
}
