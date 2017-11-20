package java100.app;

import java.net.ServerSocket;
import java.util.Collection;

import java100.app.App.HttpAgent;
import java100.app.control.Controller;

public class Practice {
    ServerSocket ss;
    
    
    void service() throws Exception {
        ss = new ServerSocket(9999);
        System.out.println("서버실행!");
        
        while (true) {
            new HttpAgent(ss.accept()).start();
        }
        
    }
    
    private void save() {
        
        Collection<Controller> controllers = controllerMap.values();
        
        for (Controller controller : controllers) {
            controller.destroy();
        }
        
    }

}
