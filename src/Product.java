public class Product {

    private int  productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public Product() {}

    public int getProductId() {
        return productId;
    } public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    } public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    } public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isInStock() {
        if (stockQuantity > 0) {
            return true;
        }
        else  {
            return false;
        }
    }
    public void restock(int quantity) {
        this.stockQuantity += quantity;
        System.out.println("Restocked: " + this.name + " x " + this.stockQuantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + stockQuantity +
                '}' ;
    }
}
