package homeworks.hw5.scnd;

public class Wall extends Barrier{
    private double high;

    public Wall(String name, double high) {
        super(name);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public String show(){
        return super.show() + " " + high;
    }
}
