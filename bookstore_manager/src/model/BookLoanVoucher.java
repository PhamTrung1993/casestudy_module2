package model;

import java.io.Serializable;
import java.time.LocalDate;

public class BookLoanVoucher implements Serializable {
    private String ID;
    private LocalDate borrowedDate;
    private Borrower borrower;
    private Book book;

    public BookLoanVoucher() {
    }

    public BookLoanVoucher(String id, LocalDate borrowedDate, Borrower borrower, Book book) {
        this.ID = id;
        this.borrowedDate = borrowedDate;
        this.borrower = borrower;
        this.book = book;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Borrower getBookBorrower() {
        return borrower;
    }

    public void setBookBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookLoanVoucher{" +
                "borrowedDate=" + borrowedDate +
                ", bookBorrower=" + borrower +
                ", book=" + book +
                '}';
    }
}

