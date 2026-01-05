public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(int productId, String name, double price, int stockQuantity, int warrantyMonths) {
        super(productId, name, price, stockQuantity);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warrantyMonths + " months.";
    }
}
