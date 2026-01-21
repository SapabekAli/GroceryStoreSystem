package model;
public class Electronics extends Product implements Discountable {
    private int warrantyMonths;

    public Electronics(int productId, String name, double price, int stockQuantity, int warrantyMonths) {
        super(productId, name, price, stockQuantity);
        setWarrantyMonths(warrantyMonths);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths < 0) {
            throw new IllegalArgumentException("Warranty months must be a positive integer");
        }
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getDiscountPrice(double discountPercent) {
        return price - (price * discountPercent / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warrantyMonths + " months.";
    }
}
