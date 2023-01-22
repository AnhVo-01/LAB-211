public class DiscountBill extends GroceryBill {
    int discountItem;
    double discount;
    boolean preferred;
    
    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
        discountItem = 0;
        discount = 0.0;
    }
    
    public int getDiscountCount() {
        return discountItem;
    }
     
    public double getDiscountAmount() {
        return discount;
    }
    
    public double getDiscountPercent() {
        return discount * 100 / super.getTotal();
    }
}
