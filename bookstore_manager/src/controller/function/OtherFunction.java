package controller.function;

import controller.display.DisplayBook;
import controller.display.DisplayOther;
import controller.manager.BookManager;
import controller.manager.OtherManager;
import model.Book;
import model.Other;
import model.Staff;
import view.menu.InputValue;
import view.menu.OtherMenu;
import view.menu.StaffMenu;

import java.io.IOException;
import java.util.*;

public class OtherFunction {
    public void searchOtherbyID(List<Other> otherList) {
        Iterator<Other> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = otherList.iterator();
        while (iterator.hasNext()) {
            Other holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                DisplayOther displayOther = new DisplayOther();
                OtherManager otherManager = new OtherManager(holder, displayOther);
                otherManager.updateDisplayOther();
            }
        }
    }

    public void deleteOtherByID(List<Other> othersList) {
        Iterator<Other> iterator;
        String nameValue = InputValue.enterIDForm();
        iterator = othersList.iterator();
        while (iterator.hasNext()) {
            Other holder = iterator.next();
            if (Objects.equals(holder.getName(), nameValue)) {
                othersList.remove(holder);
                break;
            }
        }
    }

    public void editOtherfByID(List<Other> otherList) throws IOException {
        Iterator<Other> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = otherList.iterator();
        while (iterator.hasNext()) {
            Other holder = iterator.next();
            if (Objects.equals(holder.getID(), idValue)) {
                OtherMenu otherMenu = new OtherMenu();
                Other newOther = otherMenu.createOtherForm();
                otherList.set(otherList.indexOf(holder), newOther);
                break;
            }
        }
    }

    public void sortOtherByID(List<Other> otherList) {
        Collections.sort(otherList, (Comparator.<Other>
                        comparingInt(other1 -> other1.ID.length())
                .thenComparingInt(other2 -> other2.ID.length())));
        System.out.println("After-sorted:");
        for (Other other : otherList) {
            System.out.println(other);
        }
    }
}