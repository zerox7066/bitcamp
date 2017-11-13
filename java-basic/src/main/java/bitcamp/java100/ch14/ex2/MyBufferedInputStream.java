package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyBufferedInputStream extends FileInputStream {
    
    byte[] buf = new byte[8192];
    int len;
    int cursor;
    
    public MyBufferedInputStream(String name) throws FileNotFoundException {
        super(name);
    }
    
    @Override
    public int read() throws IOException {
        if (cursor >= len) {
            cursor = 0;
            len = this.read(buf);
            if (len == -1)
                return -1;
        }
        
        return buf[cursor++] & 0x000000FF;   // 데이타 앞에(ex 0b10000000)일 경우 앞에 3byte가 1로 채워짐!!
    }
    
    
}
