package controller.manager;

import controller.display.DisplayBorrower;
import model.Borrower;

public class BorrowerManager {
    private final Borrower model;
    private final DisplayBorrower view;

    public BorrowerManager(Borrower model, DisplayBorrower view) {
        this.model = model;
        this.view = view;
    }
    public String getBorrowerID() {
        return model.getBorrowerID();
    }
    public String getBorrowerName() {
        return model.getBorrowerName();
    }
    public String getAddress() {
        return model.getAddress();
    }
    public String getPhoneNumber() {
        return model.getPhoneNumber();
    }
    public String getEmail() {
        return model.getEmail();
    }
    public void updateDisplayBorrower() {
        view.displayBorrower(model.getBorrowerID(), model.getBorrowerName(), model.getAddress(), model.getPhoneNumber(), model.getEmail());
    }
}
