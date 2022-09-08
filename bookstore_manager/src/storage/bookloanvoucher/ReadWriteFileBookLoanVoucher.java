package storage.bookloanvoucher;

import model.BookLoanVoucher;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFileBookLoanVoucher implements IReadWriteFileBookLoanVoucher{
    public static final String fileName = "bookloanvoucher.txt";
    private static ReadWriteFileBookLoanVoucher instance = null;

    @Override
    public List<BookLoanVoucher> readData() {
        List<BookLoanVoucher> bookLoanVoucherList = new LinkedList<>();
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
        bookLoanVoucherList = (List<BookLoanVoucher>) obj;
        System.out.println("Load finish!");
        return bookLoanVoucherList;
    }

    @Override
    public void writeData(List<BookLoanVoucher> bookLoanVouchers) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(bookLoanVouchers);
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
