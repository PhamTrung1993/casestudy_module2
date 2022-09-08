package controller.function;

import controller.display.DisplayBookLoanVoucher;
import controller.manager.BookLoanVoucherManager;

import model.BookLoanVoucher;
import view.menu.BookLoanVoucherMenu;
import view.menu.InputValue;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BookLoanVoucherFunction {
    public void searchBookLoanVoucherbyID(List<BookLoanVoucher> voucherList) {
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
    public void payBookLoanVoucherById() {

    }
}
