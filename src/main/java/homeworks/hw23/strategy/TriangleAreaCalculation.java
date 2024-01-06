package homeworks.hw23.strategy;

import homeworks.hw23.strategy.AreaCalculationStrategy;

public class TriangleAreaCalculation implements AreaCalculationStrategy {
    private double base;
    private double height;
    public TriangleAreaCalculation(double base, double heigh){
        this.base = base;
        this.height = heigh;
    };
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }
}
