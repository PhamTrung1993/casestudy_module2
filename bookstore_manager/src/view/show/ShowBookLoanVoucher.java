package view.show;

import controller.function.BookLoanVoucherFunction;
import model.Book;
import model.BookLoanVoucher;
import model.Borrower;
import storage.bookloanvoucher.ReadWriteFileBookLoanVoucher;
import view.Main;
import view.menu.BookLoanVoucherMenu;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShowBookLoanVoucher {
    private static final int BACK_MAIN_MENU = 9;
    private static final int LOAD_DATA_CODE = 8;
    private static final int SAVE_DATA_CODE = 7;
    private static final int PAY_LOAN_VOUCHER_BY_ID = 6;
    private static final int SEARCH_BOOKLOANVOUCHER_BY_ID = 5;
    private static final int DISPLAY_ALL_BOOKLOANVOUCHER = 4;
    private static final int REMOVE_BOOKLOANVOUCHER_BY_ID = 3;
    private static final int EDIT_BOOKLOANVOUCHER_BY_ID = 2;
    private static final int ADD_BOOKLOANVOUCHER = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;
    public static List<BookLoanVoucher> initBookLoanVousher() {
        List<BookLoanVoucher> loanVoucherList = new ArrayList<>();
        Borrower hung = new Borrower();
        Book book = new Book("B01","Under the sea","Science","Trung","New",10000,500000);
        BookLoanVoucher loanVoucher1 = new BookLoanVoucher("L01",hung,book, LocalDate.of(2022,8,31),LocalDate.of(2022,9,2));
        loanVoucherList.add(loanVoucher1);
        return loanVoucherList;
    }
    public static void menuOfBookLoanVoucher() throws IOException {
        BookLoanVoucherFunction bookLoanVoucherFunction = new BookLoanVoucherFunction();
        BookLoanVoucherMenu bookLoanVoucherMenu = new BookLoanVoucherMenu();
        ReadWriteFileBookLoanVoucher readWriteFileBookLoanVoucher = new ReadWriteFileBookLoanVoucher();
        List<BookLoanVoucher> loanVoucherList = initBookLoanVousher();
        int option = INIT_VALUE;

        while (option != EXIT_PROGRAM) {
            option = bookLoanVoucherMenu.menu();
            switch (option) {

                case EXIT_PROGRAM :
                    System.exit(EXIT_PROGRAM);
                    break;
                case ADD_BOOKLOANVOUCHER:
                    loanVoucherList.add(bookLoanVoucherMenu.createStarDateBorrowedBookForm());
                    break;
                case EDIT_BOOKLOANVOUCHER_BY_ID:
                    bookLoanVoucherFunction.editBookLoanVoucherByID(loanVoucherList);
                    break;
                case REMOVE_BOOKLOANVOUCHER_BY_ID:
                    bookLoanVoucherFunction.deleteBookLoanVoucherByID(loanVoucherList);
                    break;
                case DISPLAY_ALL_BOOKLOANVOUCHER:
                    bookLoanVoucherMenu.displayAllLoanVoucher(loanVoucherList);
                    break;
                case SEARCH_BOOKLOANVOUCHER_BY_ID:
                    bookLoanVoucherFunction.searchBookLoanVoucherbyID(loanVoucherList);
                    break;
                case PAY_LOAN_VOUCHER_BY_ID:
                    bookLoanVoucherFunction.payBookLoanVoucherById(loanVoucherList);
                    break;
                case SAVE_DATA_CODE :
                    readWriteFileBookLoanVoucher.writeData(loanVoucherList);
                    break;
                case LOAD_DATA_CODE :
                    List<BookLoanVoucher> newReadWriteFileBookLoanvoucher = readWriteFileBookLoanVoucher.readData();
                    for (BookLoanVoucher loanVoucher: newReadWriteFileBookLoanvoucher) {
                        System.out.println(loanVoucher);
                    }
                    break;

                case BACK_MAIN_MENU :
                    Main.mainMenu();
                    break;
                default : System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}
