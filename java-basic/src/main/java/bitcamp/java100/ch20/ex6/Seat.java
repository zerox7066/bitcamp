package bitcamp.java100.ch20.ex6;

public class Seat {
    String type;
    boolean heat;
    boolean AutoControl;
    
    public Seat() {
        System.out.println("Seat()");
    }

    @Override
    public String toString() {
        return "Seat [type=" + type + ", heat=" + heat + ", AutoControl=" + AutoControl + "]";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHeat() {
        return heat;
    }

    public void setHeat(boolean heat) {
        this.heat = heat;
    }

    public boolean isAutoControl() {
        return AutoControl;
    }

    public void setAutoControl(boolean autoControl) {
        AutoControl = autoControl;
    }

}
