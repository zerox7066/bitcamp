package bitcamp.java100.ch15.ex2;

import java.net.Socket;

public class Client {
    
    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("192.168.0.58", 9999);
        System.out.println("서버와 연결되었다!");
        
        // 상대편 접속 정보 출력
        System.out.println("클라이언트와 연결되었음!");
        System.out.printf("%s : %d\n", 
                socket.getInetAddress().getHostAddress(),
                socket.getPort());
        
        socket.close();
    }

}
