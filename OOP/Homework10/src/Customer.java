package src;
import java.util.*;

public class Customer {
    private int number;
    private Date dateEnteringQueue;
    private String orderStatus;

    public Customer(int number, Date dateEnteringQueue, String orderStatus) {
        this.number = number;
        this.dateEnteringQueue = dateEnteringQueue;
        this.orderStatus = orderStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateEnteringQueue() {
        return dateEnteringQueue;
    }

    public void setDateEnteringQueue(Date dateEnteringQueue) {
        this.dateEnteringQueue = dateEnteringQueue;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}


