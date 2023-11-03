package homeworks.hw5.frst;

public class Circle implements ForFigure {
private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public String show(){
        return "" + this.radius;
    }

    @Override
    public double square() {
        return radius*3.14*2;
    }
}
