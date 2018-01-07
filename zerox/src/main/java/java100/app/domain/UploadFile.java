package java100.app.domain;

public class UploadFile {
    int no;
    String filename;
    
    @Override
    public String toString() {
        return "UploadFile [no=" + no + ", filename=" + filename + "]";
    }

    public int getNo() {
        return no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
