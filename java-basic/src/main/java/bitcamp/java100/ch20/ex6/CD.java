package bitcamp.java100.ch20.ex6;

public class CD {
    private String tilte;
    private String singer;
    
    public CD() {
        System.out.println("CD()");
    }

    
    @Override
    public String toString() {
        return "CD [tilte=" + tilte + ", singer=" + singer + "]";
    }


    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    
    
    
}
