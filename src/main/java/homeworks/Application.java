package homeworks;

import homeworks.hw3.Car;
import homeworks.hw4.Animal;
import homeworks.hw4.Cat;
import homeworks.hw4.Dog;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        System.out.println("HW4");
        System.out.println();

        List<Animal>animals = new ArrayList<Animal>();
        animals.add(new Cat("cat1", "black"));
        animals.add(new Cat("cat2", "white"));
        animals.add(new Cat("cat3", "blue"));
        animals.add(new Dog("dog1", 3));
        animals.add(new Dog("dog2", 7));
        animals.add(new Dog("dog3", 10));

        for (int x  = 0; x < animals.size(); x++){
            System.out.println(animals.get(x).show());
            animals.get(x).run();
            animals.get(x).swim();
        }

        Animal.howMany();
        Cat.howMany();
        Dog.howMany();


        System.out.println();
        System.out.println("HW3");
        System.out.println();

        Car audir8 = new Car("audir8", 380);

        System.out.println(audir8.show());
        audir8.start();
    }
}
