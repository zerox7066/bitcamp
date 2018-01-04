package bitcamp.java100.ch20.ex18;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private String color;
    private int capacity;
    
    @Autowired private Engine engine;
    
    private Map<String,String> options;
    
    public Car() {
        System.out.println("Car()");
    }
    
    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine
                + ", options=" + options + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }
    
    
}
