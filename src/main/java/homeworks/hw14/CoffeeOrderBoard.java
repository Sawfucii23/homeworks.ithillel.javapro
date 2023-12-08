package homeworks.hw14;

import java.util.ArrayList;
import java.util.List;


public class CoffeeOrderBoard {
    private static List<Order> queue;

    private static int orderCounter = 1;

    public CoffeeOrderBoard() {
        this.queue = new ArrayList<>();
    }

    public int getOrderCounter() {
        return orderCounter;
    }


    public List<Order> getQueue() {
        return queue;
    }


    public static void add(Order order){
        orderCounter++;
        order.setNumOrder(orderCounter);
        queue.add(order);
    }
    public Order deliver() {
        if (!queue.isEmpty()) {
            Order deliveredOrder = queue.get(0);
            queue.remove(0);
            return deliveredOrder;
        }
        else {
            return null;
        }
    }
    public void draw(){
        for (int i = 0; i >= queue.size(); i++){
            System.out.println(queue.get(i).getNumOrder() + " | " + queue.get(i).getName());
        }
    }

}
