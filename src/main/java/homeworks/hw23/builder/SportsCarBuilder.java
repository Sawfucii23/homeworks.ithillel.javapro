package homeworks.hw23.builder;

import homeworks.hw23.builder.Car;
import homeworks.hw23.builder.CarBuilder;

public class SportsCarBuilder implements CarBuilder {

    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public CarBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder buildWheels(String wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilder buildTransmission(String transmission) {
        car.setTransmission(transmission);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
