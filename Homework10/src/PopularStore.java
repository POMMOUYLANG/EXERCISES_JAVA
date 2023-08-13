package src;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import Config.DatabaseConnection;

public class PopularStore {
    public CustomerQueue customerQueue;
    public int servingDurationLimitInMinutes;

    public PopularStore(int servingDurationLimitInMinutes) {
        customerQueue = new CustomerQueue();
        this.servingDurationLimitInMinutes = servingDurationLimitInMinutes;
    }

    public void addCustomerToQueue(Customer customer) {
        customerQueue.addCustomer(customer);
    }

    public void serveCustomer() {
        Customer servedCustomer = customerQueue.serveCustomer();
        if (servedCustomer != null) {
            String order = getOrderFromCustomer();
            double amountToPay = getAmountToPayFromCustomer();
            int paymentMethod = getPaymentMethodFromCustomer();
            String receipt = generateReceipt(servedCustomer, order, amountToPay, paymentMethod);
            recordOrderHistory(servedCustomer.getNumber(), order, Double.toString(amountToPay));
            System.out.println(receipt);
        } else {
            System.out.println("No customers in the queue.");
        }
    }

    public String getOrderFromCustomer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("What do you like? ");
            return scanner.nextLine();
        }
    }

    public double getAmountToPayFromCustomer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Amount to pay ($): ");
            return scanner.nextDouble();
        }
    }

    public int getPaymentMethodFromCustomer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Pay by (0: cash, 1: credit card): ");
            return scanner.nextInt();
        }
    }

    public String generateReceipt(Customer customer, String order, double amountToPay, int paymentMethod) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String receipt = "Start serving time: " + dateFormat.format(new Date()) + "\n";
        receipt += "Customer No.: " + String.format("%05d", customer.getNumber()) + "\n";
        receipt += order + " = " + amountToPay + "$\n";
        if (paymentMethod == 1) {
            receipt += "(In credit card **** **** **** "
                    + getCreditCardNumberFromCustomer() + ")\n";
        }
        receipt += "------------ Thanks you!!! ------------\n";
        receipt += "Issue date: " + dateFormat.format(new Date()) + "\n";
        receipt += "---------------------------------------\n";
        receipt += "End serving time: " + dateFormat.format(new Date()) + "\n";
        receipt += "Serving duration: " + getFormattedDuration(getRandomServingDuration()) + "\n";
        return receipt;
    }

    public String getCreditCardNumberFromCustomer() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("In case credit card, please input credit card number: ");
            return scanner.nextLine();
        }
    }

    public int getRandomServingDuration() {
        return new Random().nextInt(servingDurationLimitInMinutes) + 1;
    }

    public String getFormattedDuration(int durationInMinutes) {
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, 0);
    }

    public void recordOrderHistory(int customerID, String order, String paid) {
        try (
                Connection conn = DatabaseConnection.getOrderedConnection();
                PreparedStatement stmt = conn.prepareStatement("Insert Into ordered_history(customerID, product, paid) values (?, ?, ?)");) {
            stmt.setInt(1, customerID);
            stmt.setString(2, order);
            stmt.setString(3, paid);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public String readOrderedHistory() {
        try (
            Connection conn = DatabaseConnection.getOrderedConnection();
            PreparedStatement stmt = conn.prepareStatement("select * from ordered_history");
            ResultSet rs = stmt.executeQuery()) {
            String record = "";
            while(rs.next()) {
                record += rs.getString(1) + "\t"+ rs.getString(2) + "\t"+ rs.getString(3) + "$\n";
            }
            return record;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int getLastCustomerID() {
        try (
                Connection conn = DatabaseConnection.getOrderedConnection();
                PreparedStatement stmt = conn
                        .prepareStatement("Select customerID from ordered_history order by customerID desc");
                ResultSet rs = stmt.executeQuery();) {
            int customerID = rs.getInt(1);
            return customerID;

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {
        PopularStore popularStore = new PopularStore(10);
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            int choice = 0;
            do {
                System.out.println("""
                        ---------------- Welcome To Store --------------
                        1 - Add Customer to Queue
                        2 - Serve Customer
                        3 - Display Customer In Queue
                        4 - Ordered History
                        0 - Exit
                        """);
                System.out.print("Choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 0:
                        System.out.println("Thank you...!");
                        break;
                    case 1:
                        int customerID = popularStore.getLastCustomerID() + 1 + count;
                        count++;
                        System.out.println(customerID);
                        Customer customer = new Customer(customerID, new Date(), "Waiting to order");
                        popularStore.addCustomerToQueue(customer);
                        System.out.println("Customer add successfully...!");

                        break;
                    case 2:
                        popularStore.serveCustomer();
                        break;
                    case 3:
                        popularStore.customerQueue.displayCustomersInQueue();
                        break;
                    case 4:
                        System.out.println(popularStore.readOrderedHistory());
                        break;
                    default:
                        System.out.println("Invalid Choice ...");
                        break;

                }
            } while (choice != 0);
        }
    }
}