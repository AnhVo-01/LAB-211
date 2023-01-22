
import java.util.ArrayList;

class Manage {
    Controllers ctr = new Controllers();
    public int menu(){
        System.out.println("========= FRUIT SHOP SYSTEM =========");
        System.out.print("  1. Create Fruit\n" +
                         "  2. View orders\n" +
                         "  3. Shopping (for buyer)\n" +
                         "  4. Exit\n");
        System.out.println("-------------------------------------");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
 
    public void createFruit() {
        while (true){
            System.out.println("\n-------- Create Fruit --------");
            System.out.print("Enter fruit ID: ");
            String fruitId = Validation.checkInputString();
            if (ctr.findByID(fruitId)!=null){
                System.err.println("ID exist");
                return;
            }    
            System.out.print("Enter fruit name: ");
            String fruitName = Validation.checkInputString();
            System.out.print("Enter price: ");
            double price = Validation.checkInputDouble();
            System.out.print("Enter quantity: ");
            int quantity = Validation.checkInputInt();
            System.out.print("Enter origin: ");
            String origin = Validation.checkInputString();
            ctr.createFruit(new Fruit(fruitId,fruitName,price,quantity,origin));
            System.out.println("-------------------------------");
            System.out.print("Do you want to continue (Y/N)? ");
            if (!Validation.checkInputYN()) {
                displayListFruit();
                return;      
            }        
        }
    }
    public void displayListFruit() {
        System.out.printf("%-10s%-20s%-20s%-10s%-10s\n", "FruitID", "Fruit name", "Origin", "Price", "Quantity");
        ArrayList<Fruit> list = ctr.display();
        for (Fruit fruit : list) {
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10s%-20s%-20s%-2.1f$%10s\n", fruit.getFruitID(),
                        fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice(), fruit.getQuantity());
            }
        }
    }
//    public void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
//        for (String name : ht.keySet()) {
//            System.out.println("Customer: " + name);
//            ArrayList<Order> lo = ht.get(name);
//            displayListOrder(lo);
//        }
//    }
//    static void displayListOrder(ArrayList<Order> lo) {
//        double total = 0;
//        System.out.println("Customer: ", lo.);
//        System.out.printf("%15s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
//        for (Order order : lo) {
//            System.out.printf("%15s%15d%15.0f$%15.0f$\n", order.ge,
//                    order.getQuantity(), order.getPrice(),
//                    order.getPrice() * order.getQuantity());
//            total += order.getPrice() * order.getQuantity();
//        }
//        System.out.println("Total: " + total);
//    }
    public void deleteTask(){
        
    }
    public void getDataTasks(){
        
    }
}
