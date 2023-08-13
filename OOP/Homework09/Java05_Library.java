package Homework.Homework09;

import java.util.ArrayList;
import java.util.List;

public class Java05_Library {
     public static void main(String[] args) {
        Library library = new Library();

        ArrayList<String> authors = new ArrayList<>();
        authors.add("Phearith");
        authors.add("Suos");
        Java03_Book book1 = new Java03_Book("1", "1", "Category 1","1",authors,"2020","yes",1);
        Java03_Book book2 = new Java03_Book("2", "2", "Category 2","2",authors,"2020","yes",2);
        Java03_Book book3 = new Java03_Book("3", "3", "Category 3","3",authors,"2021","yes",3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Java03_Borrow student1 = new Java03_Borrow("John","e20200576","2023-06-25","2023-06-30");
        Java03_Borrow student2 = new Java03_Borrow("John","e20200599","2023-06-25","2023-06-29");

        library.addStudent(student1);
        library.addStudent(student2);

        System.out.println("List of categories:");
        List<String> categories = library.listCategories();
        for (String category : categories) {
            System.out.println(category);
        }

        System.out.println("\nList of books in 'Category 1':");
        List<Java03_Book> booksByCategory = library.listBooksByCategory("Category 1");
        for (Java03_Book book : booksByCategory) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nList of books published in 2020:");
        List<Java03_Book> booksByYear = library.listBooksByYear("2020");
        for (Java03_Book book : booksByYear) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nList of available books:");
        List<Java03_Book> availableBooks = library.listAvailableBooks();
        for (Java03_Book book : availableBooks) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nBorrowing a book...");
        if (library.borrowBook("1", student1)) {
            System.out.println("Book borrowed successfully by " + student1.getName());
        } else {
            System.out.println("Book could not be borrowed.");
        }

        System.out.println("\nList of students who borrowed books:");
        List<Java03_Borrow> studentsWhoBorrowedBooks = library.getStudentsWhoBorrowedBooks();
        for (Java03_Borrow student : studentsWhoBorrowedBooks) {
            System.out.println(student.getName());
        }

        System.out.println("\nReturning the book...");
        library.returnBook("1", student1);

        System.out.println("\nList of available books after return:");
        availableBooks = library.listAvailableBooks();
        for (Java03_Book book : availableBooks) {
            System.out.println(book.getTitle());
        }
    }
}
class Library {
    private List<Java03_Book> books;
    private List<Java03_Borrow> students;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void addBook(Java03_Book book) {
        books.add(book);
    }
    public void removeBook(Java03_Book book) {
        books.remove(book);
    }
    public void addStudent(Java03_Borrow student) {
        students.add(student);
    }
    public void removeStudent(Java03_Borrow student) {
        students.remove(student);
    }
    public List<String> listCategories() {
        List<String> categories = new ArrayList<>();
        for (Java03_Book book : books) {
            if (!categories.contains(book.getCategory())) {
                categories.add(book.getCategory());
            }
        }
        return categories;
    }
    public List<Java03_Book> listBooksByCategory(String category) {
        List<Java03_Book> booksByCategory = new ArrayList<>();
        for (Java03_Book book : books) {
            if (book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
    }
    public List<Java03_Book> listBooksByYear(String year) {
        List<Java03_Book> booksByYear = new ArrayList<>();
        for (Java03_Book book : books) {
            if (book.getPublishedDate().equals(year)) {
                booksByYear.add(book);
            }
        }
        return booksByYear;
    }
    public List<Java03_Book> listAvailableBooks() {
        List<Java03_Book> availableBooks = new ArrayList<>();
        for (Java03_Book book : books) {
            if (book.getBookIssue().equals("yes")) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
    public void decreaseBookByIsbn(String isbn) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.decreaseCopies();
                break;
            }
        }
    }
    public void addCopiesOfBook(String isbn, int additionalCopies) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.increaseCopies(additionalCopies);
                break;
            }
        }
    }
    public void markBookUnavailable(String isbn) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.markUnavailable();
                break;
            }
        }
    }
    public void markBookAvailable(String isbn) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.markAvailable();
                break;
            }
        }
    }
    public boolean borrowBook(String isbn, Java03_Borrow student) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn) && book.getBookIssue().equals("yes") && student.canBorrow()) {
                book.markUnavailable();
                book.decreaseCopies();
                student.borrowBook(book);
                return true;
            }
        }
        return false;
    }
    public void returnBook(String isbn, Java03_Borrow student) {
        for (Java03_Book book : books) {
            if (book.getIsbn().equals(isbn) && student.getBorrowedBooks().contains(book)) {
                book.increaseCopies(1);
                book.markAvailable();
                student.returnBook(book);
                break;
            }
        }
    }
    public List<Java03_Borrow> getStudentsWhoBorrowedBooks() {
        List<Java03_Borrow> studentsWhoBorrowedBooks = new ArrayList<>();
        for (Java03_Borrow student : students) {
            if (!student.getBorrowedBooks().isEmpty()) {
                studentsWhoBorrowedBooks.add(student);
            }
        }
        return studentsWhoBorrowedBooks;
    }
}