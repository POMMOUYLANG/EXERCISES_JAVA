package Homework.Homework06;
import java.util.ArrayList;
import java.util.Scanner;
public class Java05_ShopManager {
    public static ArrayList<Java05_Shop> shopList = new ArrayList<>();

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Java05_ShopManager manager = new Java05_ShopManager();
        do{

            System.out.print("""
                ------------------------------------------------
                        New Year Gift Shop (Object mode) 
                ------------------------------------------------
                1 - List All Products
                2 - Add New Product
                3 - Remove Product by Index
                4 - Uppdate Product
                5 - Quit Programs
                Choice : """);
            choice = sc.nextInt();
            sc.nextLine();
    
            switch(choice) {
                case 1:
                    manager.listAllProducts();
                    break;
                case 2:
                    manager.addProduct(sc);
                    break;
                case 3:
                    manager.removeProduct(sc);
                    break;
                case 4:
                    manager.updateProduct(sc);
                    break;
                case 5:
                    System.out.println("Good bye...!");
                    break;
                default :
                    System.out.println("Invalid choice...!");
                    break;
    
            }
        }
        while(choice != 5);
    }

    public void listAllProducts() {
        System.out.println("""
            ------------------------------------------------
                            List All Product
            ------------------------------------------------""");
        if(shopList.isEmpty()) {
            System.out.println("\tNo Data...");
        }
        else {
            System.out.printf("%-4s %-4s    %-15s %-8s %-5s\n", "No", "Index", "Product Name", "Price", "Amount");
            System.out.println("------------------------------------------------");
            int num = 0;
            for( Java05_Shop shop : shopList) {
                System.out.printf("%04d %04d     %-15s %-8.2f %-5d\n", num, shopList.indexOf(shop), shop.getName(), shop.getPrice(), shop.getAmount());
                num++;
            }
        }
        System.out.println("------------------------------------------------");

    }

    public void addProduct(Scanner sc) {
        System.out.println("""
            ------------------------------------------------
                            Add New Product
            ------------------------------------------------""");
        System.out.print("How many new product: ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++) {
            System.out.printf("\t\nProduct #%d\n", i+1);
            System.out.print("Input Product Name: ");
            String name = sc.nextLine();
            System.out.print("Input Product Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Input Product Amount: ");
            int amount = sc.nextInt();
            sc.nextLine();

            Java05_Shop shop = new Java05_Shop(name, price, amount);
            shopList.add(shop);
            System.out.println("Info saved...!");
        }

    }
    
    public void removeProduct(Scanner sc) {
        boolean found = false;
        System.out.println("""
            ------------------------------------------------
                        Remove Product By Index
            ------------------------------------------------""");
        System.out.print("Input product index: ");
        int index = sc.nextInt();
        sc.nextLine();
        for(Java05_Shop shop : shopList) {
            int i = shopList.indexOf(shop);
            if(index == i) {
                found = true;
                shopList.remove(i);
                System.out.println("Removed successfully...!");
                break;
            }
        }

        if(!found) {
            System.out.println("Product is not found...!");
        }

    }

    public void updateProduct(Scanner sc) {
        boolean found = false;
        System.out.println("""
            ------------------------------------------------
                        Update Product By Index
            ------------------------------------------------""");
        System.out.print("Input product index: ");
        int index = sc.nextInt();
        sc.nextLine();
        for(Java05_Shop shop : shopList) {
            int i = shopList.indexOf(shop);
            if(index == i) {
                found = true;
                System.out.print("Update Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                shop.setPrice(price);
                System.out.print("Update Amount: ");
                int amount = sc.nextInt();
                sc.nextLine();
                shop.setAmount(amount);
                System.out.println("Info saved...!");
                System.out.println("Updated successfully...!");
                break;
            }
        }

        if(!found) {
            System.out.println("Product is not found...!");
        }

    }
}
