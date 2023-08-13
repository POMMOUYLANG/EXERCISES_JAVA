package Homework.Homework09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// ***Run here***
public class Java03_BookClass {
    private List<Java03_Book> bookList;
    private List<Java03_Borrow> borrowList;
    public void handleInsert() {
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------Insert new book------------");
            System.out.print("Title: ");
            String description = sc.nextLine();
            System.out.print("Description: ");
            String title = sc.nextLine();
            System.out.print("Category: ");
            String categroy = sc.nextLine();
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            ArrayList<String> authors = new ArrayList<>();
            String author;
            boolean con = true;
            do {
                System.out.print("Input Authors (input 0 to finish add more): ");
                author = sc.nextLine();
                if (author == null || author == "") {
                    System.out.println("Please input author!");
                } else if (author.equals("0")) {
                    con = false;
                } else {
                    authors.add(author);
                }
            } while (con);
            System.out.print("Input published date: ");
            String publishedDate = sc.nextLine();
            System.out.print("Availability for borrow(yes/no): ");
            String bookIssue = sc.nextLine();
            System.out.print("Input quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();
            bookList.add(new Java03_Book(title, description, categroy, isbn, authors, publishedDate, bookIssue, qty));
            System.out.print("Input 1 for add new book: ");
            String compare = sc.nextLine();
            if (!compare.equals("1")) {
                condition = false;
            }
            sc.close();
        } while (condition);
    }
    public void listAllBook() {
        int i = 0;
        System.out.println("------------------------");
        for (Java03_Book book : bookList) {
            System.out.println("BookID :" + i);
            book.displayBooks();
            System.out.println("------------------------");
            i++;
        }
    }
    public void listAllBorrow() {
        int i = 0;
        System.out.println("------------------------");
        for (Java03_Borrow borrow : borrowList) {
            System.out.println("Borrow ID :" + i);
            System.out.println(borrow);
            System.out.println("------------------------");
            i++;
        }
    }
    public void increasebooks() {
        Scanner sc = new Scanner(System.in);
        int bookID;
        if (bookList.size() == 0) {
            System.out.println("No book in inventory!!");
        } else {
            System.out.println("------------Increase book------------");
            System.out.print("Input book ID to increase: ");
            bookID = sc.nextInt();
            if (bookID > bookList.size() || bookID < 0) {
                System.out.println("Book ID not found!!");
            } else {
                for (Java03_Book book : bookList) {
                    bookList.get(bookID).setQuantity(book.getQuantity() + 1);
                }
            }
        }
        sc.close();
    }
    public void decreasebooks() {
        Scanner sc = new Scanner(System.in);
        int bookID;
        if (bookList.size() == 0) {
            System.out.println("No book in inventory!!");
        } else {
            System.out.println("------------Decrease book------------");
            System.out.print("Input book ID to increase: ");
            bookID = sc.nextInt();
            if (bookID > bookList.size() || bookID < 0) {
                System.out.println("Book ID not found!!");
            } else {
                boolean a = false;
                for (Java03_Book book : bookList) {
                    if (bookList.get(bookID).getQuantity() <= 1) {
                        a = true;
                    } else {
                        bookList.get(bookID).setQuantity(book.getQuantity() - 1);
                    }
                }
                if(a){
                    System.out.println("Cannot decrease!!");
                }
            }
            sc.close();
        }
    }
    public void doIncreaseAndDecrease(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Please input option------------");
        System.out.println("1- increase");
        System.out.println("2- decrease");
        System.out.print("Please input: ");
        String option = sc.nextLine();
        if(option.equals("1")){
            increasebooks();
        }else if(option.equals("2")){
            decreasebooks();
        }else{
            System.out.println("Your option does not exist!!");
        }
        sc.close();
    }
    public void menu() {
        System.out.println("""
                    1.Search book
                    2.Check availability for borrow
                    3.Check number of books in inventory
                    4.Decrease and increase number or books in inventory
                    5.Borrow (some books can be borrowed, some cannot)
                    6.Data input (user input from keyboard to create new book)
                    7.Display book information
                    8.Display all borrow
                    9.Exit
                """);
    }
    public void searchBookByTitle(String title) {
        int i = 0;
        for (Java03_Book book : bookList) {
            if (book.getTitle().equals(title)) {
                System.out.println(bookList.get(i));
            }
            i++;
        }
    }
    public void searchBookByIsbn(String isbn) {
        int i = 0;
        for (Java03_Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println(bookList.get(i));
            }
            i++;
        }
    }
    public void handleSearch() {
        Scanner sc = new Scanner(System.in);
        if (bookList.size() == 0) {
            System.out.println("Don't have book!");
        } else {
            boolean condition = true;
            do {
                System.out.println("------------Search options------------");
                System.out.println("1- Search by title\n2- Search by isbn");
                System.out.print("input option: ");
                String option = sc.nextLine();
                if (option.equals("1")) {
                    System.out.println("------------Search by title------------");
                    System.out.print("Input title to search: ");
                    String title = sc.nextLine();
                    searchBookByTitle(title);
                    condition = false;
                } else if (option.equals("2")) {
                    System.out.println("------------Search by ISBN------------");
                    System.out.print("Input ISBN to search: ");
                    String isbn = sc.nextLine();
                    searchBookByIsbn(isbn);
                    condition = false;
                } else {
                    System.out.println("--->> Your option does not exist!");
                }
                sc.close();
            } while (condition);
        }
    }
    public void canBorrow() {
        if (bookList.size() == 0) {
            System.out.println("Don't have book!");
        } else {
            int i = 0;
            for (Java03_Book book : bookList) {
                if (book.getBookIssue().equals("yes")) {
                    System.out.println(bookList.get(i));
                }
                i++;
            }
        }
    }
    public boolean availableBook(int bookId) {
        if (bookList.get(bookId).getBookIssue().equals("yes")) {
            return false;
        }
        return true;
    }
    public void checkNumbersOfBooks() {
        if (bookList.size() == 0) {
            System.out.println("Don't have book!");
        } else if (bookList.size() == 1) {
            System.out.println("We have " + bookList.size() + "book in inventory.");
        } else {
            System.out.println("We have " + bookList.size() + "books in inventory.");
        }
    }
    public void borrowBook() {
        boolean condition = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------New borrow------------");
            System.out.print("Input name: ");
            String name = sc.nextLine();
            System.out.print("Input School ID: ");
            String schoolId = sc.nextLine();
            System.out.print("Input borrow date: ");
            String borrowDate = sc.nextLine();
            System.out.print("Input return date: ");
            String returnDate = sc.nextLine();
            List<Integer> books = new ArrayList<>();
            int book;
            boolean con = true;
            do {
                System.out.print("Input book (input -1 to finish add more): ");
                book = sc.nextInt();
                if (book >= bookList.size()) {
                    System.out.println("No book!");
                } else if (book == -1) {
                    con = false;
                } else if (availableBook(book)) {
                    System.out.println("This book cannot borrow!");
                } else {
                    books.add(book);
                }
                sc.close();
            } while (con);
            borrowList.add(new Java03_Borrow(name, schoolId, borrowDate, returnDate, books));
            System.out.print("Input 1 for add new borrow: ");
            sc.nextLine();
            String compare = sc.nextLine();
            System.out.println();
            if (!compare.equals("1")) {
                condition = false;
            }
        } while (condition);
        
    }
    public void doBorrow() {
        if (bookList.size() == 0) {
            System.out.println("--->> Don't have books for borrow!");
        } else {
            borrowBook();
        }
    }
    public void displayBorrows() {
        for (Java03_Borrow borrow : borrowList) {
            System.out.println(borrow);
        }
    }
    public static void main(String[] args) {
        Java03_BookClass BC = new Java03_BookClass();
        BC.bookList = new ArrayList<>();
        BC.borrowList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        do {
            BC.menu();
            System.out.print("Input Option[1 to 9]: ");
            String option = sc.nextLine();
            switch (option) {
                case "1": {
                    BC.handleSearch();
                    break;
                }
                case "2": {
                    BC.canBorrow();
                    break;
                }
                case "3": {
                    BC.checkNumbersOfBooks();
                    break;
                }
                case "4": {
                    BC.doIncreaseAndDecrease();
                    break;
                }
                case "5": {
                    BC.doBorrow();
                    break;
                }
                case "6": {
                    BC.handleInsert();
                    break;
                }
                case "7": {
                    BC.listAllBook();
                    break;
                }
                case "8": {
                    BC.listAllBorrow();
                    break;
                }
                case "9": {
                    condition = false;
                    break;
                }
                default: {
                    System.out.println("------------Your option does not exist!------------");
                }
            }
        } while (condition);
        sc.close();
    }
}
