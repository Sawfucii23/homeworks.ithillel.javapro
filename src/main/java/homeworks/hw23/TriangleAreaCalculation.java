package homeworks.hw23;

public class TriangleAreaCalculation implements AreaCalculationStrategy{
    @Override
    public double calculateArea(double base, double height) {
        return (base * height) / 2;
    }
}
