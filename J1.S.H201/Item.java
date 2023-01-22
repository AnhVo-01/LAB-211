public class Item {
    String name;
    double price;
    double discount;

    public Item() {
    }

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    } 
}
