package storage.borrower;

import model.Borrower;
import storage.book.IReadWriteFileBook;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFileBorrower implements IReadWriteFileBorrower {
    private static final String fileName = "D:\\case_study_module2\\bookstore_manager\\file\\borrower.txt";
    private static ReadWriteFileBorrower instance = null;

    public ReadWriteFileBorrower() {
    }

    public static ReadWriteFileBorrower getInstance() {
        if (instance == null) instance = new ReadWriteFileBorrower();
        return instance;
    }

    @Override
    public List<Borrower> readData() {
        List<Borrower> bookBorrowerList = new LinkedList<>();
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
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        bookBorrowerList = (List<Borrower>) obj;
        System.out.println("Load finish!");
        return bookBorrowerList;
    }

    @Override
    public void writeData(List<Borrower> bookBorrowers) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookBorrowers);
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
