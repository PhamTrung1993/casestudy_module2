package controller.display;

import model.Book;
import model.Borrower;

import java.time.LocalDate;

public class DisplayBookLoanVoucher {
    public void displayCustomers(String ID, Borrower borrower, Book book, LocalDate borrowedDate, LocalDate returnDate) {
        System.out.printf("%-5s%-200s%-200s%-20s\n","ID","borrower","book","Borrowed Day", "Return Day");
        System.out.printf("%-5s%-200s%-200s%-20s\n",ID,borrower,book,borrowedDate,returnDate);
    }
}
