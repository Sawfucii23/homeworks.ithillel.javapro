package homeworks.hw23;

public class SportsCarBuilder implements CarBuilder{

    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("Powerful engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sports wheels");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manual");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
