package FirstDemo.Demo_8;

public class classBook {
    private String title;
    private double price;

    //default Constructor
    //ctrl + . 
        // @Override
        // public String toString() {
        //     return "classBook [title=" + title + "]";
        // }
    //no-arg constructor
    public classBook(){
        this("Khmer",2500);
        System.out.println("My Constructor.");
    }
    //parameterized constructor
    public classBook(String title){
        // this.title = title;
        // this.price = 100;
        this(title,150);
    }

    public classBook(String title, double price){
        this.title = title;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book [title = " + title + ", Price = " + price +"]";
    }


    //Seter and Getter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    
    
    
    
}
