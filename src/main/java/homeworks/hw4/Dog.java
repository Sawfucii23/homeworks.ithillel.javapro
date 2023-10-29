package homeworks.hw4;

public class Dog extends Animal{
    private int age;

    public static int amountD = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        super(name);
        this.age = age;
        amountD +=1;
    }

    @Override
    public String show() {
        return super.show()+ " " + this.age;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "Пробіг(ла) 500м");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + "Проплив(ла) 20м");;
    }


    public static void howMany() {
        Animal.howMany();
        System.out.println("Собак:" + amountD);
    }
}
