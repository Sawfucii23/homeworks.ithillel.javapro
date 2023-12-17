package homeworks.hw16;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();


    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> newFruits) {
        fruits.addAll(newFruits);
    }
    public double getWeight() {

        if (fruits.isEmpty()) {
            return 0.0f;
        }
        double weight = 0;
        // Вага одного фрукта (припустимо, що всі фрукти в коробці одного типу)
        if (fruits instanceof Apple) {
            weight = 1.0f;
        } else if (fruits instanceof Orange) {
            weight = 1.5f;
        }
        weight = weight*fruits.size();
        return weight;
    }
    public boolean compare(Box<?> anotherBox) {
        return this.fruits.size() == anotherBox.fruits.size();
    }
    public void merge(Box<T> anotherBox) {

        if (!fruits.isEmpty() && !anotherBox.fruits.isEmpty()) {
            if (fruits.get(0).getClass() != anotherBox.fruits.get(0).getClass()) {
                throw new IllegalArgumentException("Неможливо злити коробки з різними типами фруктів.");
            }
        }
        fruits.addAll(anotherBox.fruits);
    }
}



