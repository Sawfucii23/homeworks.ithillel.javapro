package homeworks.hw23;

public class CarCreator {
    private CarBuilder builder;

    public CarCreator(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildTransmission();
        return builder.getCar();
    }
}
