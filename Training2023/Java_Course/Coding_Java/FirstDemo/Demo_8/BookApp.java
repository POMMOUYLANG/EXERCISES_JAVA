package FirstDemo.Demo_8;

import java.util.Arrays;

public class BookApp {
    public static void main(String[] args) {
        int numberOfBook = 3;
        BookService bookService = new BookService();
        Book[] books = bookService.createBooks(numberOfBook);
        
        System.out.println("=========================");
        bookService.print(books);
        System.out.println("=========================");
        // bookService.sortArray(books);
        // bookService.print(books);

        // Collections.sort(books);

        // Arrays.sort(books);
        // bookService.print(books);

        double totalAmount = bookService.totalAmount(books);
        System.out.println("Total Amount : " +totalAmount);

    }
}
