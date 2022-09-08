package storage.staff;

import model.Staff;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileStaff implements IReadWriteFileStaff{
    public static final String fileName = "staff.txt";
    private static ReadWriteFileStaff instance = null;

    public ReadWriteFileStaff() {
    }
    public static ReadWriteFileStaff getInstance() {
        if (instance == null) instance = new ReadWriteFileStaff();
        return instance;
    }
    @Override
    public List<Staff> readData() {
        List<Staff> staffList = new ArrayList<>();
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
        staffList = (List<Staff>) obj;
        return staffList;
    }

    @Override
    public void writeData(List<Staff> staffList) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(staffList);
            oos.close();
            fos.close();
            System.out.println("Save finish!!!");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
