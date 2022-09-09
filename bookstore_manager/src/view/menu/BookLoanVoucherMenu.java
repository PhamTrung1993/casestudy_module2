package view.menu;

import model.Book;
import model.BookLoanVoucher;
import model.Borrower;
import model.Staff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class BookLoanVoucherMenu {
    public BookLoanVoucher createStarDateBorrowedBookForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW BORROWED LOAN VOUCHER<<<<<<<<<");
        System.out.print("1. Enter Book Loan Voucher ID: ");
        String id = bufferedReader.readLine();
        System.out.print("2. Enter Star Day Borrowed Book: ");
        LocalDate starDay = enterDay();
        Borrower borrower = BorrowerMenu.createBorrowerForm();
        Book book = BookMenu.createBookForm();

        BookLoanVoucher newBookLoanVoucher = new BookLoanVoucher(id, borrower, book, starDay);
        return newBookLoanVoucher;
    }
    public BookLoanVoucher endToBorrowedBookForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>END BORROWED LOAN VOUCHER<<<<<<<<<");
        System.out.print("1. Enter Book Loan Voucher ID: ");
        String id = bufferedReader.readLine();
        System.out.print("2. Enter Star Day Borrowed Book: ");
        LocalDate starDay = enterDay();
        System.out.print("2. Enter End Day Borrowed Book: ");
        LocalDate endDay = enterDay();
        Borrower borrower = BorrowerMenu.createBorrowerForm();
        Book book = BookMenu.createBookForm();

        BookLoanVoucher newBookLoanVoucher = new BookLoanVoucher(id, borrower, book, starDay,endDay);
        return newBookLoanVoucher;
    }
    private static LocalDate enterDay() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Day: ");
        int day = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Month: ");
        int month = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Year: ");
        int year = Integer.parseInt(bufferedReader.readLine());
        return LocalDate.of(year,month,day);
    }
    public int menu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("        BOOK LOAN VOUCHER MANAGER        ");
        System.out.println("-------------------***-------------------");
        System.out.println("|    1. Add Book Loan Voucher.          |");
        System.out.println("|    2. Edit Book Loan Voucher by ID    |");
        System.out.println("|    3. Remove Book Loan Voucher by ID. |");
        System.out.println("|    4. Display Book Loan Voucher.      |");
        System.out.println("|    5. Search Book Loan Voucher by ID. |");
        System.out.println("|    6. Pay Book Loan Voucher by ID.    |");
        System.out.println("|    7. Save Borrower to database.      |");
        System.out.println("|    8. Load Borrower from database.    |");
        System.out.println("|    9. Back Main menu.                 |");
        System.out.println("|    0. Exit program.                   |");
        System.out.println("-----------------------------------------");
        System.out.print("  Select function: ");
        int option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllLoanVoucher(List<BookLoanVoucher> loanVoucherList) {
        System.out.println("############################ DISPLAY ALL GUESTROOM ##############################");
        Iterator<BookLoanVoucher> iterator = loanVoucherList.iterator();
        while (iterator.hasNext()) {
            BookLoanVoucher holder = iterator.next();
            System.out.printf("%-5s%-110s%-160s%-20s\n",holder.getID(),holder.getBorrower(),holder.getBook(),holder.getBorrowedDate(),holder.getReturnDate());
        }
        System.out.println("......................................................................................");
    }
}
