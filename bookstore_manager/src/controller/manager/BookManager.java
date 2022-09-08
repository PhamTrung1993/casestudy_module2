package controller.manager;

import controller.display.DisplayBook;
import model.Book;

public class BookManager {
    private final Book model;
    private final DisplayBook view;

    public BookManager(Book model, DisplayBook view) {
        this.model = model;
        this.view = view;
    }
    public String getBookID() {
        return model.getBookID();
    }
    public String getBookTitle() {
        return model.getBookTitle();
    }
    public String getBookName() {
        return model.getBookName();
    }
    public String getCategory() {
        return model.getCategory();
    }
    public String getwritingMaster() {
        return model.getWritingMaster();
    }
    public String getStatus() {
        return model.getStatus();
    }
    public long getrentCost() {
        return model.getRentCost();
    }
    public void setRentCost(long rentCost){
        model.setRentCost(rentCost);
    }
    public String getBookPrice() {
        return model.getCategory();
    }
    public void setBookPrice(long bookPrice) {
        model.setBookPrice(bookPrice);
    }
    public void updateDisPlayBook() {
        view.displayBook(model.getBookID(), model.getBookTitle(), model.getBookName(), model.getCategory(), model.getWritingMaster(), model.getStatus(), model.getRentCost(), model.getBookPrice());
    }
}
