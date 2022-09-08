package model;

import java.io.Serializable;
import java.time.LocalDate;

public class BookLoanVoucher implements Serializable {
    private String ID;
    private LocalDate borrowedDate;
    private Borrower borrower;
    private LocalDate returnDate;
    private Book book;

    public BookLoanVoucher() {
    }

    public BookLoanVoucher(String id,Borrower borrower,Book book, LocalDate borrowedDate ) {
        this.ID = id;
        this.borrowedDate = borrowedDate;
        this.borrower = borrower;
        this.book = book;
        this.returnDate = null;
    }

    public BookLoanVoucher(String ID,Borrower borrower,Book book, LocalDate borrowedDate, LocalDate returnDate) {
        this.ID = ID;
        this.borrowedDate = borrowedDate;
        this.borrower = borrower;
        this.returnDate = returnDate;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookLoanVoucher{" +
                "ID='" + ID + '\'' +
                ", borrowedDate=" + borrowedDate +
                ", borrower=" + borrower +
                ", returnDate=" + returnDate +
                ", book=" + book +
                '}';
    }
}

