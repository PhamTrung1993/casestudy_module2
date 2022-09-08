package model;

import java.io.Serializable;

public class BookClass implements Serializable {
    private String className;
    private Book book;
    private int amount;

    public BookClass() {
    }

    public BookClass(String className, Book book, int amount) {
        this.className = className;
        this.book = book;
        this.amount = amount;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "className='" + className + '\'' +
                ", book=" + book +
                ", amount=" + amount +
                '}';
    }
}

