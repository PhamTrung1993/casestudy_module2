package controller.manager;


import controller.display.DisplayBookLoanVoucher;
import model.Book;
import model.BookLoanVoucher;
import model.Borrower;

import java.time.LocalDate;

public class BookLoanVoucherManager {
    private BookLoanVoucher model;
    private DisplayBookLoanVoucher view;

    public BookLoanVoucherManager(BookLoanVoucher model, DisplayBookLoanVoucher view) {
        this.model = model;
        this.view = view;
    }

    public String getId() {
        return model.getID();
    }
    public Borrower getBorrower() {
        return model.getBorrower();
    }
    public void setBorrower(Borrower borrower) {
        model.setBorrower(borrower);
    }
    public Book getBook() {
        return model.getBook();
    }
    public void setBook(Book book) {
        model.setBook(book);
    }
    public LocalDate getBorrowedDate() {
        return model.getBorrowedDate();
    }
    public LocalDate getReturnDate() {
        return model.getReturnDate();
    }
    public void updateBookLoanVoucher() {
        view.displayCustomers(model.getID(), model.getBorrower(), model.getBook(),model.getBorrowedDate(), model.getReturnDate());
    }
}
