package view;

import controller.function.BookLoanVoucherFunction;
import model.Book;
import model.BookLoanVoucher;
import model.Borrower;
import view.menu.BookLoanVoucherMenu;
import view.show.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static final int STAFF_MENU = 5;
    private static final int OTHER_MENU= 4;
    private static final int BOOK_LOAN_VOUCHER_MENU= 3;
    private static final int BORROWER_MENU= 2;
    private static final int BOOK_MENU = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    public static void main(String[] args) {
        try {
            mainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void mainMenu() throws IOException {

        do {
            System.out.println();
            System.out.println("    BOOK MARKET MANAGEMENT PROGRAM      ");
            System.out.println("-------------------***------------------");
            System.out.println("|   1. Book Menu.                      |");
            System.out.println("|   2. Borrower Menu .                 |");
            System.out.println("|   3. Book Loan Voucher Menu.         |");
            System.out.println("|   4. Other Menu.                     |");
            System.out.println("|   5. Staff Menu.                     |");
            System.out.println("|   0. Exit Program.                   |");
            System.out.println("----------------------------------------");
            System.out.print("Mời chọn chức năng: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case BOOK_MENU:
                    BookShow.menuOfBook();
                    break;
                case BORROWER_MENU:
                    ShowBorrower.menuOfBorrower();
                    break;
                case BOOK_LOAN_VOUCHER_MENU:
                    ShowBookLoanVoucher.menuOfBookLoanVoucher();
                    break;
                case OTHER_MENU:
                    ShowOther.menuOfOther();
                    break;
                case STAFF_MENU:
                    ShowStaff.menuOfStaff();
                    break;
                case EXIT_PROGRAM:
                    System.exit(0);
                    break;
            }
            System.out.println("\n---------------------END MAIN MENU------------------\n");
        } while (true);
    }
}
