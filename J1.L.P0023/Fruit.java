public class Fruit {
    String FruitID;
    String FruitName;
    double Price;
    int Quantity;
    String Origin;

    public Fruit() {
    }

    public Fruit(String FruitID, String FruitName, double Price, int Quantity, String Origin) {
        this.FruitID = FruitID;
        this.FruitName = FruitName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Origin = Origin;      
    }

    public String getFruitID() {
        return FruitID;
    }

    public String getFruitName() {
        return FruitName;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getOrigin() {
        return Origin;
    }
    
    public double getAmount() {
        double amount = Price*Quantity;
        return amount;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
