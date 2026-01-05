import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inventory.add(new FoodProduct(1, "Milk", 450, 20, "20.01.2026"));
        inventory.add(new Electronics(2, "Headsets", 15000, 5, 12));

        boolean running = true;

        while (running) {
            System.out.println("\n=== STORE MENU ===");
            System.out.println("1. Add Foods");
            System.out.println("2. Add Electronics");
            System.out.println("3. Show everything");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addFood();
            } else if (choice == 2) {
                addElectronics();
            } else if (choice == 3) {
                printAll();
            } else if (choice == 0) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("There is no such command!");
            }
        }
    }

    private static void addFood() {
        System.out.println("--- Adding Food ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Expiration date: ");
        String date = scanner.nextLine();

        inventory.add(new FoodProduct(id, name, price, qty, date));
        System.out.println("Successfully added!");
    }

    private static void addElectronics() {
        System.out.println("--- Adding Electronics ---");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Warranty (months): ");
        int warranty = scanner.nextInt();

        inventory.add(new Electronics(id, name, price, qty, warranty));
        System.out.println("Successfully added!");
    }

    private static void printAll() {
        System.out.println("\n--- LIST OF PRODUCTS ---");
        for (Product p : inventory) {
            System.out.println(p.toString());
        }
    }
}
