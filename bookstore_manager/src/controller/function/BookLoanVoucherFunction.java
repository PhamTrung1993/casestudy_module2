package controller.function;

import controller.display.DisplayBookLoanVoucher;
import controller.manager.BookLoanVoucherManager;

import model.BookLoanVoucher;
import view.menu.BookLoanVoucherMenu;
import view.menu.InputValue;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BookLoanVoucherFunction {
    public void searchBookLoanVoucherbyID(List<BookLoanVoucher> voucherList) {
        // Iterator là công cụ để duyệt các phần tử trong mảng
        Iterator<BookLoanVoucher> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = voucherList.iterator();
        while(iterator.hasNext()){
            BookLoanVoucher holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                DisplayBookLoanVoucher voucher = new DisplayBookLoanVoucher();
                BookLoanVoucherManager voucherManager = new BookLoanVoucherManager(holder, voucher);
                voucherManager.updateBookLoanVoucher();
            }
        }
    }
    public void deleteBookLoanVoucherByID(List<BookLoanVoucher> voucherList) {
        Iterator<BookLoanVoucher> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = voucherList.iterator();
        while (iterator.hasNext()) {
            BookLoanVoucher holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                voucherList.remove(holder);
                break;
            }
        }
    }
    public void editBookLoanVoucherByID(List<BookLoanVoucher> voucherList) throws IOException {
        Iterator<BookLoanVoucher> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = voucherList.iterator();
        while (iterator.hasNext()) {
            BookLoanVoucher holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                BookLoanVoucherMenu voucherMenu = new BookLoanVoucherMenu();
                BookLoanVoucher voucher =  voucherMenu.endToBorrowedBookForm();
                voucherList.set(voucherList.indexOf(holder), voucher);
                break;
            }
        }
    }
    public void payBookLoanVoucherById(List<BookLoanVoucher> voucherList) {
        Iterator<BookLoanVoucher> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = voucherList.iterator();
        while (iterator.hasNext()) {
            BookLoanVoucher holder = iterator.next();
            if ((Objects.equals(holder.getID(), idValue))) {
                if (holder.getReturnDate() != null) {
                    int day = calculateDateBorowed(holder);
                    long money = holder.getBook().getRentCost()*day;
                    System.out.println("Book rental amount is: " + money);
                }
                else {
                    System.err.println("The customer has not returned the book");
                }
            }
        }
    }

    public int calculateDateBorowed(BookLoanVoucher loanVoucher) {
        LocalDate starDay = loanVoucher.getBorrowedDate();
        LocalDate returnDay = loanVoucher.getReturnDate();
        int days = CalculateDate.calculateDays(returnDay.getDayOfMonth(),returnDay.getMonthValue(),returnDay.getYear())
                - CalculateDate.calculateDays(starDay.getDayOfMonth(),starDay.getMonthValue(),starDay.getYear());
        return days;
    }
}
