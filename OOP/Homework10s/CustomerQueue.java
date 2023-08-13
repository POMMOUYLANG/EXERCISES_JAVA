package Homework.Homework10s;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue{
    private Queue<Customer> queue;
    private int maxCapacity;
    
    public CustomerQueue(){
        this.queue = new LinkedList<>();
        this.maxCapacity = 100;
    }

    public int getCustomerCount(){
        return this.queue.size();
    }

    public void addCustomer(Customer customer){
        if(queue.size() < maxCapacity){
            queue.add(customer);
        }
        else{
            System.out.println("Queue is full!");
        }
    }

    public Customer removeCustomer(){
        if (queue.isEmpty()){
            return null;
        }

        return queue.remove();
    }

    public void serveCustomer(){
        if(!queue.isEmpty()){
            Customer customer = queue.peek();
            System.out.println("Serving customer: " + customer.getNumber());
            queue.remove();
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayCustomers() {
        System.out.println("Customers in the queue:");
        for (Customer customer : queue) {
            System.out.println(customer);
        }
    }
}
class Main{
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();

        Customer customer1 = new Customer(1, "2021-01-01", "pending");
        Customer customer2 = new Customer(2, "2021-01-02", "pending");
        Customer customer3 = new Customer(3, "2021-01-03", "pending");

        customerQueue.addCustomer(customer1);
        customerQueue.addCustomer(customer2);
        customerQueue.addCustomer(customer3);
        customerQueue.addCustomer(customer3);

        customerQueue.serveCustomer();

        System.out.println("Customer in queue: " + customerQueue.getCustomerCount());

        //customerQueue.removeCustomer();
        customerQueue.displayCustomers();
    }
}