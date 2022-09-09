package storage.other;

import model.Other;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteFileOther implements IReadWriteFileOther {
    public static final String fileName = "D:\\case_study_module2\\bookstore_manager\\file\\bookclass.txt";
    private static ReadWriteFileOther instance = null;

    public ReadWriteFileOther() {
    }

    @Override
    public List<Other> readData() {
        List<Other> otherList = new LinkedList<>();
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
        otherList = (List<Other>) obj;
        System.out.println("Load finish!");
        return otherList;
    }

    @Override
    public void writeData(List<Other> others) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(others);
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
