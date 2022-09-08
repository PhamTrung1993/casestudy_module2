package controller.function;

import controller.display.DisplayBook;
import controller.manager.BookManager;
import model.Book;
import view.menu.BookMenu;
import view.menu.InputValue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BookFunction {
    public void searchBookbyName(List<Book> bookList){
        Iterator<Book> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = bookList.iterator();
        while(iterator.hasNext()){
            Book holder = iterator.next();
            if (Objects.equals(holder.getBookName(), nameValue)) {
                DisplayBook displayBook = new DisplayBook();
                BookManager bookManager = new BookManager(holder, displayBook);
                bookManager.updateDisPlayBook();
            }
        }
    }
    public void searchBookbyID(List<Book> bookList) {
        Iterator<Book> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = bookList.iterator();
        while(iterator.hasNext()){
            Book holder = iterator.next();
            if (Objects.equals(holder.getBookID(), idValue)) {
                DisplayBook displayBook = new DisplayBook();
                BookManager bookManager = new BookManager(holder, displayBook);
                bookManager.updateDisPlayBook();
            }
        }
    }
    public void deleteBookByName(List<Book> bookList) {
        String nameValue;
        Iterator<Book> iterator;
        nameValue = InputValue.enterNameForm();
        iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book holder = iterator.next();
            if (Objects.equals(holder.getBookName(), nameValue)) {
                bookList.remove(holder);
                break;
            }
        }
    }
    public void editBookByName(List<Book> bookList) throws IOException {
        Iterator<Book> iterator;
        String nameValue = InputValue.enterNameForm();
        iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book holder = iterator.next();
            if (Objects.equals(holder.getBookName(), nameValue)) {
                BookMenu bookMenu = new BookMenu();
                bookList.set(bookList.indexOf(holder), bookMenu.createBookForm());
                break;
            }
        }
    }
}
