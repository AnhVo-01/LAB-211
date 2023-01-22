
import java.util.ArrayList;

public class Order {
    String customer;
    ArrayList<Fruit> fruitList;
    double total;

    public Order() {
    }

    public Order(String customer, ArrayList<Fruit> fruitList, double total) {
        this.customer = customer;
        this.fruitList = fruitList;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public ArrayList<Fruit> getFruitList() {
        return fruitList;
    }

    public double getTotal() {
        return total;
    }
    
}
