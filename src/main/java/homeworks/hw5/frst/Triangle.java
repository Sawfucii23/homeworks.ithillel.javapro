package homeworks.hw5.frst;

import homeworks.hw5.frst.ForFigure;

public class Triangle implements ForFigure {

    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public double getSideLength1() {
        return sideLength1;
    }

    public void setSideLength1(double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public void setSideLength2(double sideLength2) {
        this.sideLength2 = sideLength2;
    }

    public double getSideLength3() {
        return sideLength3;
    }

    public void setSideLength3(double sideLength3) {
        this.sideLength3 = sideLength3;
    }

    public Triangle(double sideLength1, double sideLength2, double sideLength3) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }
    public String show(){
        return "" + this.sideLength1 + " " + this.sideLength2 + " " + this.sideLength3;
    }

    @Override
    public double square() {
        double p = (sideLength1+sideLength2+sideLength3)/2;
        double sq = p*(p -sideLength1)*(p-sideLength2)*(p-sideLength3);
        sq = Math.sqrt(sq);
        return sq;
    }
}
