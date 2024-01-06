package homeworks.hw23.fabric;

import homeworks.hw23.fabric.Chair;
import homeworks.hw23.fabric.Furniture;
import homeworks.hw23.fabric.Sofa;
import homeworks.hw23.fabric.Table;

public class FurnitureFactory {
    public Furniture getFurniture(String furnitureType) {
        if (furnitureType == null) {
            return null;
        }
        if (furnitureType.equalsIgnoreCase("CHAIR")) {
            return new Chair();
        } else if (furnitureType.equalsIgnoreCase("TABLE")) {
            return new Table();
        } else if (furnitureType.equalsIgnoreCase("SOFA")) {
            return new Sofa();
        }

        return null;
    }
}
