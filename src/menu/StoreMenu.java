package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreMenu implements Menu {
    private ArrayList<Product> inventory = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public StoreMenu() {
        this.inventory = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        inventory.add(new FoodProduct(1, "Milk", 450, 20, "20.01.2026"));
        inventory.add(new Electronics(2, "Headsets", 15000, 5, 12));
    }

    @Override
    public void displayMenu() {
        System.out.println("\n=== STORE MENU ===");
        System.out.println("1. Add Foods");
        System.out.println("2. Add Electronics");
        System.out.println("3. Show All Products");
        System.out.println("4. (Polymorphism DEMO)");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1: addFood(); break;
                    case 2: addElectronics(); break;
                    case 3: printAll(); break;
                    case 4: demonstratePolymorphism(); break;
                    case 0: System.out.println("Exiting..."); running = false; break;
                    default: System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        } scanner.close();
    }

    private void addFood() {
        try {
            System.out.print("Enter Food ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Food Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Food Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Food Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Food Expiry Date: ");
            String expirationDate = scanner.nextLine();

            FoodProduct food =  new FoodProduct(id, name, price, quantity, expirationDate);
            inventory.add(food);

            System.out.println("Food has been added");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private void addElectronics() {
        try {
            System.out.print("Enter Electronic ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Electronic Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Electronic Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Electronic Quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Electronic Warranty Date: ");
            int warrantyDate = scanner.nextInt();
            scanner.nextLine();

            Electronics elec =  new Electronics(id, name, price, qty, warrantyDate);
            inventory.add(elec);

            System.out.println("Electronics has been added");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private void demonstratePolymorphism() {
        System.out.print("\n--- Polymorphism DEMO --- ");
        for (Product p : inventory) {
            System.out.println(" Product: " + p.getName());
            System.out.println(" -> Category: " + p.getCategory());
            System.out.println(" -> Full Info: " + p.toString());
            System.out.println("-------------------------------");

            if (p instanceof Discountable) {
                Discountable d = (Discountable) p;
                System.out.println(" -> Discount price(10%): " + d.getDiscountPrice(10));
            }
            System.out.println("-------------------------------");
        }
    }

    private void printAll() {
        System.out.println("\n--- LIST OF PRODUCTS ---");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory) {
                System.out.println(p.toString());
            }
        }
    }
}

