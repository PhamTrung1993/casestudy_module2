package view.show;

import controller.function.BookFunction;
import model.Book;
import storage.book.ReadWriteFileBook;
import view.Main;
import view.menu.BookMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookShow {
    private static final int BACK_MAIN_MENU = 9;
    private static final int LOAD_DATA_CODE = 8;
    private static final int SAVE_DATA_CODE = 7;
    private static final int SEARCH_BOOK_BY_NAME = 6;
    private static final int SEARCH_BOOK_BY_ID = 5;
    private static final int DISPLAY_ALL_BOOK = 4;
    private static final int REMOVE_BOOK_BY_NAME = 3;
    private static final int EDIT_BOOK_BY_NAME = 2;
    private static final int ADD_BOOK = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;

    public static List<Book> initBook() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("A0001","Science","Lion","Animal","Trung","New",15000,200000);
        bookList.add(book1);
        return bookList;
    }
    public static void menuOfBook() throws IOException {
        BookFunction bookFunction = new BookFunction();
        BookMenu bookMenu = new BookMenu();
        ReadWriteFileBook readWriteFileBook = new ReadWriteFileBook();
        List<Book> bookList = initBook();
        int option = INIT_VALUE;

        while (option != EXIT_PROGRAM) {
            option = bookMenu.menu();
            switch (option) {

                case EXIT_PROGRAM :
                    System.exit(EXIT_PROGRAM);
                    break;
                case ADD_BOOK :
                    bookList.add(bookMenu.createBookForm());
                    break;
                case EDIT_BOOK_BY_NAME :
                    bookFunction.editBookByName(bookList);
                    break;
                case REMOVE_BOOK_BY_NAME :
                    bookFunction.deleteBookByName(bookList);
                    break;
                case DISPLAY_ALL_BOOK :
                    bookMenu.displayAllBooks(bookList);
                    break;
                case SEARCH_BOOK_BY_ID :
                    bookFunction.searchBookbyID(bookList);
                    break;
                case SEARCH_BOOK_BY_NAME :
                    bookFunction.searchBookbyName(bookList);
                    break;
                case SAVE_DATA_CODE :
                    readWriteFileBook.writeData(bookList);
                    break;
                case LOAD_DATA_CODE :
                    List<Book> newReadWriteFileBook = readWriteFileBook.readData();
                    for (Book book: newReadWriteFileBook) {
                        System.out.println(book);
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
