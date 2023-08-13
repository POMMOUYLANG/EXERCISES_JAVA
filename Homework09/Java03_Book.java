package Homework.Homework09;

import java.util.ArrayList;

public class Java03_Book {
    private String title;
    private String description;
    private String category;
    private String isbn;
    private ArrayList<String> author;
    private String publishedDate;
    private String bookIssue;
    private int quantity;
    public Java03_Book(String title, String description, String category, String isbn, ArrayList<String> author,
            String publishedDate, String bookIssue, int quantity) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.isbn = isbn;
        this.author = author;
        this.publishedDate = publishedDate;
        this.bookIssue = bookIssue;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Java03_Book(String title, String description, String category, String isbn, ArrayList<String> author,
            String publishedDate, String bookIssue) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.isbn = isbn;
        this.author = author;
        this.publishedDate = publishedDate;
        this.bookIssue = bookIssue;
    }
    public String getBookIssue() {
        return bookIssue;
    }
    public void setBookIssue(String bookIssue) {
        this.bookIssue = bookIssue;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public ArrayList<String> getAuthor() {
        return author;
    }
    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }
    public String getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }
    public void listAuthors() {
        int i = 1;
        for (String author : author) {
            System.out.println("Author" + i + ":" + author);
            i++;
        }
    }
    public void displayBooks() {
        System.out.println("Title: " + this.title);
        System.out.println("Description: " + this.description);
        System.out.println("Category: : " + this.category);
        System.out.println("ISBN: " + this.isbn);
        listAuthors();
        System.out.println("published Date: " + this.publishedDate);
        System.out.println("Avialible for borrow: " + this.bookIssue);
        System.out.println("Quantity of book: " + this.quantity);
    }
    @Override
    public String toString() {
        return "Title: " + this.title
                + "\nDescription: " + this.description
                + "\nCategory:" + this.category
                + "\nISBN: " + this.isbn
                + "\nAuthors: " + this.author
                + "\nPublished Date: " + this.publishedDate
                + "\nBook issue: " + this.bookIssue
                + "\nBook quantity: " + this.quantity;
    }
    public void decreaseCopies() {
        quantity--;
    }
    public void increaseCopies(int additionalCopies) {
        quantity += additionalCopies;
    }
    public void markUnavailable() {
        this.bookIssue = "no";
    }
    public void markAvailable() {
        bookIssue = "yes";
    }
}