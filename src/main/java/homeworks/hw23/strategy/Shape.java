package homeworks.hw23.strategy;

public class Shape {
    private AreaCalculationStrategy strategy;

    public Shape(AreaCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        return strategy.calculateArea();
    }
}
