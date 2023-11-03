package homeworks.hw5.scnd;

public class Racetrack extends Barrier{
    private double distance;

    public Racetrack(String name, double distance) {
        super(name);
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public String show(){
        return super.show() + " " + distance;
    }
}
