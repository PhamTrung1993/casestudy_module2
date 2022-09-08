package controller.function;

import controller.display.DisplayBorrower;
import controller.manager.BorrowerManager;
import model.Borrower;
import view.menu.BorrowerMenu;
import view.menu.InputValue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BorrowerFunction {
    public void searchBorrowerbyID(List<Borrower> borrowerList) {
        Iterator<Borrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while(iterator.hasNext()){
            Borrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                DisplayBorrower displayBorrower = new DisplayBorrower();
                BorrowerManager bookBorrowerManager = new BorrowerManager(holder, displayBorrower);
                bookBorrowerManager.updateDisplayBorrower();
            }
        }
    }
    public void deleteBorrowerByID(List<Borrower> borrowerList) {
        Iterator<Borrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while (iterator.hasNext()) {
            Borrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                borrowerList.remove(holder);
                break;
            }
        }
    }
    public void editBorrowerByID(List<Borrower> borrowerList) throws IOException {
        Iterator<Borrower> iterator;
        String idValue = InputValue.enterIDForm();
        iterator = borrowerList.iterator();
        while (iterator.hasNext()) {
            Borrower holder = iterator.next();
            if (Objects.equals(holder.getBorrowerID(), idValue)) {
                BorrowerMenu borrowerMenu = new BorrowerMenu();
                Borrower newborrower =  borrowerMenu.createBorrowerForm();
                borrowerList.set(borrowerList.indexOf(holder), newborrower);
                break;
            }
        }
    }
}
