package java100.app;

public class Test {
    
    public static void main(String[] args) {
        String[] path = "/score/add?name=aaa&kor=100&end=100".split("\\?"); //문자로 취급
        
        String[] arr = path[1].split("&");
        
        for(String param : arr) {
            String[] kv = param.split("=");
            System.out.printf("%s : %s\n", kv[0], kv[1]);
        }
    }

}
