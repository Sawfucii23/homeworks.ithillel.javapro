package homeworks;

import homeworks.hw4.Animal;
import homeworks.hw4.Cat;
import homeworks.hw4.Dog;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
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

        animals.get(0).howMany();
        animals.get(3).howMany();
    }
}
