
import java.util.ArrayList;

public class GroceryBill {
    private ArrayList<Item> receipt = new ArrayList<>();
    Employee clerk;
    double total;
    double internalDiscount;
    
    public GroceryBill() {
    }

    public GroceryBill(Employee clerk) {
	      this.clerk = clerk;
	      receipt = new ArrayList<Item>();
	      total = 0.0;
	      internalDiscount = 0.0;
    }
    
    public void add(Item i) {
	      receipt.add(i);
	      total += i.getPrice();
	      internalDiscount += i.getDiscount();
    }
    public double getTotal() {
        return Math.rint(total * 100) / 100.0;
    }
	
    public void printReceipt() {
	      System.out.println(this);
    }
}
