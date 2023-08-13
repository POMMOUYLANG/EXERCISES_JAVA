package Homework.Homework09;

import java.util.ArrayList;
import java.util.Scanner;
public class Java04_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java04_Categories category = new Java04_Categories("Language","About language");
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Phearith");
        authors.add("Suos");
        Java03_Book book1 = new Java03_Book("1", "1", "1","1",authors,"1","1",1);
        Java03_Book book2 = new Java03_Book("2", "2", "2","2",authors,"2","2",2);
        Java03_Book book3 = new Java03_Book("3", "3", "3","3",authors,"3","3",3);
        category.addBook(book1);
        category.addBook(book2);
        category.addBook(book3);
        category.removeBook(book1);
        System.out.println("------------List all book in category------------");
        category.listBooks();
        System.out.println("--------------------Find book by title and ISBN--------------------");
        System.out.print("Input title or ISBN of book: ");
        String search = sc.nextLine();
        System.out.println(category.findBook(search));
        System.out.println("--------------------Count all books in category--------------------");
        System.out.println(category.countBooks());
        sc.close();
    }
}

class Java04_Categories {
    private ArrayList<Java03_Book> books;
    
    // Constructor
    public Java04_Categories(String name, String description) {
        this.books = new ArrayList<>();
    }
    
    // Method to add a book to the category
    public void addBook(Java03_Book book) {
        books.add(book);
    }
    
    // Method to remove a book from the category
    public void removeBook(Java03_Book book) {
        books.remove(book);
    }
    
    // Method to list all books in the category
    public void listBooks() {
        for (Java03_Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("---------------------------------");
        }
    }
    
    // Method to find a book in the category by ISBN or Title
    public Java03_Book findBook(String query) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(query) || book.getTitle().equals(query)) {
                return book;
            }
        }
        return null; // Book not found
    }
    // Method to count the number of books in the category
    public int countBooks() {
        return books.size();
    }
}