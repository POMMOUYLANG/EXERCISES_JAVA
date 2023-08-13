package src;
public class CustomerQueue {
    private static final int MAX_CUSTOMERS = 100;
    public static Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    private int count;

    public CustomerQueue() {
        customers = new Customer[MAX_CUSTOMERS];
        count = 0;
    }

    public int getCustomersCount() {
        return count;
    }

    public void addCustomer(Customer customer) {
        if (count < MAX_CUSTOMERS) {
            customers[count] = customer;
            count++;
        }
    }

    public void removeCustomer() {
        if (count > 0) {
            for (int i = 0; i < count - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[count - 1] = null;
            count--;
        }
    }

    public Customer serveCustomer() {
        if (count > 0) {
            Customer servedCustomer = customers[0];
            removeCustomer();
            return servedCustomer;
        }
        return null;
    }

    public void displayCustomersInQueue() {
        System.out.println("Customers in Queue:");
        for (int i = 0; i < count; i++) {
            Customer customer = customers[i];
            System.out.println("Customer " + customer.getNumber());
        }
        System.out.println();
    }
}