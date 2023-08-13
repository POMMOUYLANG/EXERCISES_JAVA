package Homework.Homework09;

import java.util.ArrayList;
import java.util.List;

public class Java03_Borrow {
    private String name;
    private String schoolId;
    private String borrowDate;
    private String returnDate;
    public Java03_Borrow(String name, String schoolId, String borrowDate, String returnDate) {
        this.name = name;
        this.schoolId = schoolId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.borrowedBooks = new ArrayList<>();
    }
    private List<Integer> books;
    private List<Java03_Book> borrowedBooks;
    public List<Java03_Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public Java03_Borrow(String name, String schoolId, String borrowDate, String returnDate, List<Integer> books) {
        this.name = name;
        this.schoolId = schoolId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.books = books;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchoolId() {
        return schoolId;
    }
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
    public String getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public List<Integer> getBooks() {
        return books;
    }
    public void setBooks(List<Integer> books) {
        this.books = books;
    }
    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nSchool ID: " + this.schoolId +
                "\nBorrow Date: " + this.borrowDate +
                "\nReturn Date: " + this.returnDate +
                "\nBooks: " + this.books;
    }
    public boolean canBorrow() {
        return borrowedBooks.size() < 5;
    }
    public void borrowBook(Java03_Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Java03_Book book) {
        borrowedBooks.remove(book);
    }
}
