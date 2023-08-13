package Homework.Homework10s;

import java.util.Scanner;

public class CustomerClass {
    private int number;
    private String enteringDate;
    private String orderStatus;
    
    public CustomerClass(int number, String enteringDate, String orderStatus){
        this.number = number;
        this.enteringDate = enteringDate;
        this.orderStatus = orderStatus;
    }

    public CustomerClass(){
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getEnteringDate(){
        return enteringDate;
    }
    public void setEnteringDate(String enteringDate){
        this.enteringDate = enteringDate;
    }

    public String getOrderStatus(){
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }    
    
    public void inputCustomerInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer number: ");
        this.number = sc.nextInt();

        System.out.print("Enter customer entering date(yyyy-MM-dd): ");
        sc.nextLine();
        this.enteringDate = sc.nextLine();

        System.out.print("Enter customer order status: ");
        this.orderStatus = sc.nextLine();

        sc.close();
    }

    public void displayCustomerInfo(){
        System.out.println("\n\n------------------------ Customer Info ------------------------");
        System.out.println("Customer number: " + number);
        System.out.println("Customer entering date: " + enteringDate);
        System.out.println("Customer order status: " + orderStatus + "\n\n");
    }
    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
class TestCustomer{
    public static void main(String[] args) {
        CustomerClass c1 = new CustomerClass();
        
        c1.inputCustomerInfo();
        c1.displayCustomerInfo();
    }
}