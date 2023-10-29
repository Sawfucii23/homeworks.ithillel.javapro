package homeworks.hw4;

public class Cat extends Animal{
    private String colours;
    public static int amountC = 0;

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    public Cat(String name, String colours) {
        super(name);
        this.colours = colours;
        amountC +=1;
    }

    @Override
    public String show() {
        return super.show() +" " +  this.colours;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "Пробіг(ла) 200м");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + "Проплив(ла) 10м");;
    }


    public static void howMany() {
        Animal.howMany();
        System.out.println("Котів:" + amountC);
    }
}
