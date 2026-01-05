public class Product {
    protected int productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }
    public Product() {}

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be less than 0!");
            this.price = 0;
        }
    }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            this.stockQuantity = 0;
        }
    }

    public String getCategory() {
        return "General goods";
    }

    @Override
    public String toString() {
        return "[" + getCategory() + "] " + name + ", Price: " + price;
    }
}