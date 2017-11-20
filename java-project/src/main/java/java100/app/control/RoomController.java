package java100.app.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
public class RoomController extends ArrayList<Room> implements Controller {
    
    private static final long serialVersionUID = 1L;
    
    
    // Scanner 객체를 준비한다.
    Scanner keyScan = new Scanner(System.in);
    private String dataFilePath;

    public RoomController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }

    @Override
    public void destroy() {

        try ( 
                PrintWriter out = new PrintWriter(
                                    new BufferedWriter(
                                        new FileWriter(this.dataFilePath))); 
        ) {
            for (Room room : this) {
                out.println(room.toCSVString());
            }
            
            out.flush();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void init() {

        try (
                BufferedReader in = new BufferedReader(new FileReader(this.dataFilePath)); 
        ) {
            
            String csv = null;
            while((csv = in.readLine()) != null) {
                try {
                    this.add(new Room(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response); break;
        case "/room/add": this.doAdd(request, response); break;
        case "/room/view": this.doView(request, response); break;
        case "/room/update": this.doUpdate(request, response); break;
        case "/room/delete": this.doDelete(request, response); break;
        default: 
            System.out.println("해당 명령이 없습니다.");
        } 
    }

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        
        out.println("[강의실 변경]");
        Room room = find(name);
        
        if (room == null) {
            out.printf("'%s'강의실 정보가 없습니다.\n", name);
            return;
        }
        
        room.setLocation(request.getParameter("location"));
        room.setName(request.getParameter("name"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
        
        out.println("변경하였습니다.!");
    }
    
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 상세 정보]");
        String name = request.getParameter("name");
        
        Room room = find(name);
        
        if (room == null) {
            out.printf("'%s'강의실 정보가 없습니다.\n", name);
            return;
        }
        
        out.printf("위치: %s\n", room.getLocation());
        out.printf("강의실명: %s\n", room.getName());
        out.printf("수용인원: %d\n", room.getCapacity());
    } 
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 목록]");
        
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            out.printf("%s, %s, %d\n",  
                room.getLocation(), room.getName(), room.getCapacity());
        }
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 등록]");
        
        Room room = new Room();
        room.setName(request.getParameter("name")); 
        
        if (find(room.getName()) != null) {
            out.println("이미 등록된 강의실입니다.");
            return;
        }
        
        room.setLocation(request.getParameter("location"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
        
        this.add(room);
        out.println("저장되었습니다.");
    } 
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 삭제]");
        String roomName = request.getParameter("name");
        
        Room room = find(roomName);
        
        if (room == null) {
            out.printf("'%s' 강의실 정보가 없습니다.\n", roomName);
            return;
        }
        
        this.remove(room);
        out.println("삭제하였습니다.");

    }
    
    private Room find(String roomName) {
        Iterator<Room> iterator = this.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }
}










