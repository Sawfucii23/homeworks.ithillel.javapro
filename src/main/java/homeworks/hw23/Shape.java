package homeworks.hw23;

public class Shape {
    private AreaCalculationStrategy strategy;

    public Shape(AreaCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea(double length, double width) {
        return strategy.calculateArea(length, width);
    }
}
