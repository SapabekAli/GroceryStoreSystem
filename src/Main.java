public class Main {
    public static void main(String[] args) {
        System.out.println("=== Grocery Store Management System ===");
        System.out.println();

        Product product1 = new Product(1, "milk inside of bag of milk",150 , 100 );
        Product product2 = new Product( 2, "Bread", 250, 100 );
        Product product3 = new Product();

        Customer customer1 = new Customer(1, "Ali", "Standard", 0 );
        Customer customer2 = new Customer(2, "Bob", "Silver", 25000 );

        Sale sale1 = new Sale(1001, "Ali","22-12-2025");
        Sale sale2 = new Sale(1002, "Bob","22-12-2025");

        System.out.println("--- PRODUCTS ---");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        System.out.println("--- SALES ---");
        System.out.println(sale1);
        System.out.println(sale2);
        System.out.println();

        System.out.println("--- CUSTOMERS ---");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println();

        System.out.println("--- TESTING GETTERS ---");
        System.out.println("Product 1 name: " + product1.getName());
        System.out.println("Product 1 price: " + product1.getPrice());
        System.out.println("Sale 1 date: " + sale1.getDate());
        System.out.println("Customer 1 name: " + customer1.getName());
        System.out.println();

        System.out.println("--- TESTING SETTERS ---");
        System.out.println("Updating product3...");
        product3.setProductId(3);
        product3.setName("Golden Apple");
        product3.setPrice(50000.0);
        product3.setStockQuantity(5);
        System.out.println("Updated: " + product3);
        System.out.println();

        System.out.println("Changing sale2 customer...");
        sale2.setCustomerName("Daria");
        System.out.println("Updated: " + sale2);
        System.out.println();

        System.out.println("--- TESTING PRODUCT METHODS ---");
        System.out.println(product1.getName() + " Is in stock: " +  product1.isInStock() );
        product1.restock(10);
        System.out.println();

        System.out.println("--- TESTING SALE METHODS ---");
        System.out.println("Adding items to Sale: " + sale1.getSaleId());
        sale1.addItem(product1.getPrice());
        sale1.addItem(product1.getPrice());

        double finalPrice1 = sale1.calculateTotal(customer1.getMembershipLevel());
        System.out.println("Final price for Ali: " + finalPrice1);

        sale1.completeSale();
        System.out.println("Sale 1 completed.");
        System.out.println();

        System.out.println("--- TESTING CUSTOMER METHODS ---");
        System.out.println(customer1.getName() + " is VIP: " + customer1.isVIP());

        System.out.println("Processing purchase for " + customer1.getName());
        customer1.addPurchase(finalPrice1);

        System.out.println("Processing large purchase for " + customer2.getName());
        customer2.addPurchase(60000.0);
        System.out.println(customer2.getName() + " is VIP: " + customer2.isVIP());
        System.out.println();

        System.out.println("--- FINAL STATE ---");
        System.out.println("Products:");
        System.out.println(product1);
        System.out.println(product3);
        System.out.println();

        System.out.println("Sales:");
        System.out.println(sale1);
        System.out.println(sale2);
        System.out.println();

        System.out.println("Customers:");
        System.out.println(customer1);
        System.out.println(customer2);

        System.out.println("\n=== Program Complete ===");
    }

}
