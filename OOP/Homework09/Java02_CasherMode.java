package Homework.Homework09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java02_CasherMode {
    private List<Java02_Product> products;
    private double totalRevenue;

    public Java02_CasherMode() {
        products = new ArrayList<>();
        totalRevenue = 0.0;
    }

    public void addProduct(Java02_Product product) {
        products.add(product);
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public void updateProduct(int index, Java02_Product updatedProduct) {
        if (index >= 0 && index < products.size()) {
            products.set(index, updatedProduct);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public void listAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product List:");
            for (int i = 0; i < products.size(); i++) {
                Java02_Product product = products.get(i);
                System.out.println("Product " + i + ":");
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Stock: " + product.getStock());
                System.out.println("---------------------");
            }
        }
    }

    public void serveCustomers() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean servingCustomers = true;

            while (servingCustomers) {
                System.out.println("Cashier Menu:");
                System.out.println("1. List all products available");
                System.out.println("2. Serve a customer");
                System.out.println("3. Close today's shop");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        listAllProducts();
                        break;
                    case 2:
                        serveCustomer();
                        break;
                    case 3:
                        servingCustomers = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }

    public void serveCustomer() {
        Scanner sc = new Scanner(System.in);
        List<Java02_Product> customerProducts = new ArrayList<>();
        double totalAmount = 0.0;

        System.out.println("Enter the product numbers and quantities (0 to stop):");

        while (true) {
            System.out.print("Product number:");
            int productNumber = sc.nextInt();
            if (productNumber == 0) {
                break;
            }
            System.out.print("Quantity:");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            if (productNumber >= 0 && productNumber < products.size()) {
                Java02_Product product = products.get(productNumber);
                if (quantity <= product.getStock()) {
                    product.setStock(product.getStock() - quantity);
                    customerProducts.add(product);
                    totalAmount += product.getPrice() * quantity;
                    System.out.println("--------------------------");
                } else {
                    System.out.println("Insufficient stock for product " + productNumber);
                    System.out.println("--------------------------");
                }
            } else {
                System.out.println("Invalid product number: " + productNumber);
                    System.out.println("--------------------------");
            }
            sc.close();
        }

        if (customerProducts.isEmpty()) {
            System.out.println("No products selected.");
        } else {
            System.out.println("Invoice:");
            for (int i = 0; i < customerProducts.size(); i++) {
                Java02_Product product = customerProducts.get(i);
                System.out.println("Product " + i + ":");
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("---------------------");
            }
            System.out.println("Total Amount: $" + totalAmount);

            System.out.println("Enter discount amount (0 if no discount):");
            double discount = sc.nextDouble();
            sc.nextLine(); 

            double discountedAmount = totalAmount - discount;
            System.out.println("Discounted Amount: $" + discountedAmount);

            totalRevenue += discountedAmount;
        }
    }

    public void closeShop() {
        System.out.println("Today's Total Revenue: $" + totalRevenue);
    }

    public static void main(String[] args) {
        Java02_CasherMode shop = new Java02_CasherMode();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("--------------Admin Menu--------------");
            System.out.println("1. List all products in shop");
            System.out.println("2. Add new product to the list");
            System.out.println("3. Remove product from list by index");
            System.out.println("4. Update product in list");
            System.out.println("5. Cashier Menu");
            System.out.println("6. Close today's shop");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    shop.listAllProducts();
                    break;
                case 2:
                    System.out.println("--------------Enter product details--------------");
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: $");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); 

                    Java02_Product newProduct = new Java02_Product(name, price, stock);
                    shop.addProduct(newProduct);
                    System.out.println("--------------Product added successfully--------------");
                    break;
                case 3:
                    System.out.print("--------------Enter product index to remove--------------");
                    int removeIndex = sc.nextInt();
                    sc.nextLine(); 

                    shop.removeProduct(removeIndex);
                    break;
                case 4:
                    System.out.print("--------------Enter product index to update-------------- ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine(); 

                    System.out.println("--------------Enter updated product details--------------");
                    System.out.print("Name: ");
                    String updatedName = sc.nextLine();
                    System.out.print("Price: $");
                    double updatedPrice = sc.nextDouble();
                    System.out.print("Stock: ");
                    int updatedStock = sc.nextInt();
                    sc.nextLine(); 

                    Java02_Product updatedProduct = new Java02_Product(updatedName, updatedPrice, updatedStock);
                    shop.updateProduct(updateIndex, updatedProduct);
                    break;
                case 5:
                    shop.serveCustomers();
                    break;
                case 6:
                    shop.closeShop();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                    
            }
            
        }
        sc.close();
    }
}