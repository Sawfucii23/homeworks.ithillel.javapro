package homeworks.hw23.strategy;

import homeworks.hw23.strategy.AreaCalculationStrategy;

public class RectangleAreaCalculation implements AreaCalculationStrategy {

    private double length;
    private double width;
    public RectangleAreaCalculation(double length, double width){
        this.length = length;
        this.width = width;
    };
    public double calculateArea() {
        return this.length * this.width;
    }
}
