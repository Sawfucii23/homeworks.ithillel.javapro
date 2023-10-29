package homeworks.hw3;

public class Car {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Car(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String show(){
        return this.name + " " + this.hp;
    }
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    protected void startElectricity(){
        System.out.println("Запуск системи живлення");
    }
    protected void startCommand(){
        System.out.println("Запуск системи ПЗ");
    }
    protected void startFuelSystem(){
        System.out.println("Запуск паливної системи");
    }
}
