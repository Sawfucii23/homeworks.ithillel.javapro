package homeworks.hw5.scnd;

public class Barrier {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Barrier(String name) {
        this.name = name;
    }
    public String show(){
        return this.name;
    }
}
