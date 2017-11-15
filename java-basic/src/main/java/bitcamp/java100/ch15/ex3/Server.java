package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    
    public static void main(String[] args) throws Exception {
        
        // 서버 소켓을 생성할 때 대기열의 개수 설정
        ServerSocket ss = new ServerSocket(9999);        
        System.out.println("서버 실행!");
                        
        Socket socket = ss.accept();
        
        Scanner in = new Scanner(socket.getInputStream());
        
        String line = in.nextLine();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        out.println(line);
        
        in.close();
        out.close();
        
        socket.close();
                
        ss.close();
        System.out.println("서버 종료!");
    }

}
