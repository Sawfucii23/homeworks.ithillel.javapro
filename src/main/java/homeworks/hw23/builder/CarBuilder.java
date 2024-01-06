package homeworks.hw23.builder;

import homeworks.hw23.builder.Car;

public interface CarBuilder {
    CarBuilder buildEngine(String engine);
    CarBuilder buildWheels(String wheels);
    CarBuilder buildTransmission(String transmission);
    Car getCar();
}
