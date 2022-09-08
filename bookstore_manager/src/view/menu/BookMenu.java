package view.menu;

import model.Book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class BookMenu {
    public static Book createBookForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW BOOK<<<<<<<<<");
        System.out.print("1. Enter Book ID: ");
        String id = bufferedReader.readLine();
        System.out.print("2. Enter Book Title: ");
        String bookTitle = bufferedReader.readLine();
        System.out.print("3. Enter Book Name: ");
        String bookName = bufferedReader.readLine();
        System.out.print("4. Enter Category: ");
        String category = bufferedReader.readLine();
        System.out.print("5. Enter Writing Master: ");
        String writingMaster = bufferedReader.readLine();
        System.out.print("6. Enter Status: ");
        String status = bufferedReader.readLine();
        System.out.print("7. Enter Rent Cost: ");
        long rentCost = Long.parseLong(bufferedReader.readLine());
        System.out.print("8. Enter Price of Book: ");
        long bookPrice = Long.parseLong(bufferedReader.readLine());

        Book newBook = new Book(id, bookTitle, bookName,category,writingMaster,rentCost,bookPrice);
        return newBook;
    }
    public int menu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("             BOOK MENU                   ");
        System.out.println("-------------------***-------------------");
        System.out.println("|    1. Add Book.                       |");
        System.out.println("|    2. Edit Book by Name.              |");
        System.out.println("|    3. Remove Book by Name.            |");
        System.out.println("|    4. Display Book.                   |");
        System.out.println("|    5. Search Book by ID.              |");
        System.out.println("|    6. Search Book by Name.            |");
        System.out.println("|    7. Save Book to database.          |");
        System.out.println("|    8. Load Book from database.        |");
        System.out.println("|    9. Back Main menu.                 |");
        System.out.println("|    0. Exit program.                   |");
        System.out.println("-----------------------------------------");
        System.out.print("  Select function: ");
        int option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllBooks(List<Book> bookList) {
        System.out.println("############################ DISPLAY ALL GUESTROOM ##############################");
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book holder = iterator.next();
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", holder.getBookID(),holder.getBookTitle(),holder.getBookName()
                    ,holder.getCategory(),holder.getWritingMaster(),holder.getStatus(), holder.getRentCost(), holder.getBookPrice());
        }
        System.out.println("......................................................................................");
    }
}
