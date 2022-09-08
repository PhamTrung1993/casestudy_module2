package controller.manager;

import controller.display.DisplayStaff;
import model.Staff;

public class StaffManager {
    private final Staff model;
    private final DisplayStaff view;

    public StaffManager(Staff model, DisplayStaff view) {
        this.model = model;
        this.view = view;
    }
    public String getStaffID(){
        return model.getID();
    }
    public String getStaffName(){
        return model.getStaffName();
    }
    public String getStaffAddress() {
        return model.getStaffName();
    }
    public String getStaffPhoneNumber() {
        return model.getPhoneNumber();
    }
    public String getStaffEmail() {
        return model.getStaffEmail();
    }
    public long getStaffHourlyWages() {
        return model.getHourly();
    }
    public void setStaffHourlyWages(long hourlyWages) {
        model.setHourly(hourlyWages);
    }
    public int getStaffWorkingHours() {
        return model.getWorkingHours();
    }
    public void setStaffWorkingHours(int workingHours) {
        model.setHourly(workingHours);
    }
    public void updateDisplayStaff() {
        view.displayStaff(model.getID(), model.getStaffName(), model.getStaffaddresss(), model.getPhoneNumber(), model.getStaffEmail(), model.getHourly(), model.getWorkingHours());
    }
}
