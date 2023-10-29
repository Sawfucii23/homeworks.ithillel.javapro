package homeworks.hw4;

public class Animal {
    private String name;

    public static int amountA = 0;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
        amountA += 1;
    }

    public String show(){
        return this.name;
    }

    public void run(){

    }
    public void swim(){

    }
    public static void howMany(){
        System.out.println("Тварин: " + amountA);
    }
}
