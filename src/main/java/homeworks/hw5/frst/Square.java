package homeworks.hw5.frst;

import homeworks.hw5.frst.ForFigure;

public class Square implements ForFigure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    public String show(){
        return "" + this.side;
    }
    @Override
    public double square() {
        return side*side;
    }
}
