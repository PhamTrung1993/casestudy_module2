package storage.book;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileBook implements IReadWriteFileBook {
    private static final String fileName="D:\\case-study-module2\\bookstore-manager\\file\\book.txt";
    private static ReadWriteFileBook instance = null;

    public ReadWriteFileBook() {
    }
    public static ReadWriteFileBook getInstance() {
        if (instance == null) instance = new ReadWriteFileBook();
        return instance;
    }

    @Override
    public List<Book> readData() {
        List<Book> bookList = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.err.println("Can't open file or can't find file");
        }
        Object obj = null;
        try {
            obj = ois.readObject();
            System.out.println("Load finish!!!");
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        bookList = (List<Book>) obj;
        return bookList;

    }

    @Override
    public void writeData(List<Book> bookList) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookList);
            oos.close();
            fos.close();
            System.out.println("Save finish!");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

