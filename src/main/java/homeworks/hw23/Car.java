package homeworks.hw23;

public class Car {
    private String engine;
    private String wheels;
    private String transmission;

    // setters
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
