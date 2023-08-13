package Homework.Homework10s;

import java.util.*;
public class PopularStore {
    private CustomerQueue customerQueue;
    private List<Customer> servedCustomers;

    public PopularStore(){
        this.customerQueue = new CustomerQueue();
        this.servedCustomers = new ArrayList<>();
    }

    public void serveCustomer(){
        try (Scanner scanner = new Scanner(System.in)) {
            if(!customerQueue.isEmpty()){
                Customer customer = customerQueue.removeCustomer();
                System.out.println("Serving customer: " + getCurrentTime());
                 Calendar start = Calendar.getInstance();
                
                System.out.println("What do you like?");
                String order = scanner.nextLine();
                System.out.print("\nAmount to pay ($): ");
                double amount = scanner.nextDouble();
                System.out.print("\nPay by (0: cash, 1: credit card): ");
                int paymentMethod = scanner.nextInt();
                scanner.nextLine();                     // consume the newline character
                String paymentDetails = "";

                if (paymentMethod == 1){
                    System.out.print("In case credit card, please input credit card number: ");
                    //scanner.nextLine();
                    String cardNumber = scanner.nextLine();
                    System.out.print("and pass code: ");
                    paymentDetails = "(In credit card *** *** *** " + cardNumber.substring(cardNumber.length() - 4) + ")";
                }else{
                    System.out.println("Thank you for paying by cash!");
                    
                }

                System.out.println("\n\nReceipt:");
                System.out.println("---------------------------------------");
                System.out.println("Customer No.: " + customer.getNumber());
                System.out.println(order + " = $" + amount);
                System.out.println(paymentDetails);
                System.out.println("------------ Thanks you!!! ------------");
                System.out.println("\n\nIssue date: " + getCurrentDate() + " " + getCurrentTime());
                System.out.println("---------------------------------------");

                customer.setOrderStatus(order);
                servedCustomers.add(customer);
                
                Calendar end = Calendar.getInstance();
                System.out.println("\n\nEnd serving time: " + getCurrentTime());
                System.out.println("Serving duration: " + calculateDuration(start, end));
                System.out.println("\n\n");

            }else{
                System.out.println("No customer in queue!");
            }
        }
    }

    public void addCustomerToQueue(Customer customer){
        if(customerQueue.getCustomerCount() >= 100){
            System.out.println("Maximum customer reached. Customer cannot be added to queue!");
        }else{
            customerQueue.addCustomer(customer);
            System.out.println("Customer added to queue!");
        }
    }

    public void displayCustomerQueue(){
        customerQueue.displayCustomers();
    }

    public void listServedCustomers() {
        //System.out.println("List of Served Customers:");
        for (Customer customer : servedCustomers) {
            System.out.println("Customer No.: " + customer.getNumber());
            System.out.println("Order Status: " + customer.getOrderStatus());
            System.out.println();
        }
    }

    private String calculateDuration(Calendar start, Calendar end) {
        long servingDuration = end.getTimeInMillis() - start.getTimeInMillis();
        long hours = (servingDuration / (1000 * 60 * 60)) % 24;
        long minutes = (servingDuration / (1000 * 60)) % 60;
        long seconds = (servingDuration / 1000) % 60;
    
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    

    private String getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Note: zero based!
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    private String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE); // Note: zero based!
        int second = calendar.get(Calendar.SECOND);
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}


class TestPopularStore {
    public static void main(String[] args) {
        PopularStore popularStore = new PopularStore();
        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer(1, "2023-07-10", "Waiting to Order");
        popularStore.addCustomerToQueue(customer1);

        Customer customer2 = new Customer(2, "2023-07-10", "Waiting to Order");
        popularStore.addCustomerToQueue(customer2);

        System.out.println("List of Customers in Queue:");
        popularStore.displayCustomerQueue();

        System.out.println("Serve Customer:");
        popularStore.serveCustomer();

        System.out.println("Serve Customer:");
        popularStore.serveCustomer();

        System.out.println("List of Served Customers:");
        popularStore.listServedCustomers();

        scanner.close();
    }
}
