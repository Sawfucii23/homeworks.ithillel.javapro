package homeworks.hw14;

public class Order {
    private int numOrder;
    private String name;


    public Order(int numOrder, String name) {
        this.numOrder = numOrder;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public void setName(String name) {
        this.name = name;
    }



}
