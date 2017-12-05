
package bitcamp.java100.ch20.ex14;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name;
    private int valve;
    private int cc;

    @Override
    public String toString() {
        return "Engine [name=" + name + ", valve=" + valve + ", cc=" + cc + "]";
    }

    public Engine() {
        System.out.println("Engine()");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        this.valve = valve;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
}
