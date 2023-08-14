package FirstDemo.Demo_8;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private double price;

    //Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    //
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Soting by Array
    @Override
    public int compareTo(Book other) {
        // return (int) (this.getPrice() - other.getPrice()); //sort by price
        return this.getTitle().compareTo(other.getTitle()); //sort by title
    }    
}
