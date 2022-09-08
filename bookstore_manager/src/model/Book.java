package model;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookID;
    private String bookTitle;
    private String bookName;
    private String category;
    private String writingMaster;
    private String status;
    private long rentCost;

    private long bookPrice;

    public Book() {
    }

    public Book(String bookID, String bookTitle, String bookName, String category, String writingMaster, String status, long rentCost, long bookPrice) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookName = bookName;
        this.category = category;
        this.writingMaster = writingMaster;
        this.status = status;
        this.rentCost = rentCost;
        this.bookPrice = bookPrice;
    }

    public Book(String bookID, String bookName, String category, String writingMaster, String status, long rentCost, long bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.category = category;
        this.writingMaster = writingMaster;
        this.status = status;
        this.rentCost = rentCost;
        this.bookPrice = bookPrice;
    }

    public long getRentCost() {
        return rentCost;
    }

    public void setRentCost(long rentCost) {
        this.rentCost = rentCost;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWritingMaster() {
        return writingMaster;
    }

    public void setWritingMaster(String writingMaster) {
        this.writingMaster = writingMaster;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(long bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", writingMaster='" + writingMaster + '\'' +
                ", status='" + status + '\'' +
                ", rentCost=" + rentCost +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
