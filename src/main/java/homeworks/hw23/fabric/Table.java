package homeworks.hw23.fabric;

import homeworks.hw23.fabric.Furniture;

public class Table implements Furniture {
    @Override
    public void create() {
        System.out.println("Створення стола");
    }
}

