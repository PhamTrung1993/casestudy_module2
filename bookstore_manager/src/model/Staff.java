package model;

import java.io.Serializable;

public class Staff implements Serializable, Salary {
    private String ID;
    private String staffName;
    private String staffaddresss;
    private String phoneNumber;
    private String staffEmail;
    private long hourly;
    private int workingHours;

    public Staff() {
    }

    public Staff(String ID, String staffName, String staffaddresss, String phoneNumber, String staffEmail,long hourly,int workingHours) {
        this.ID = ID;
        this.staffName = staffName;
        this.staffaddresss = staffaddresss;
        this.phoneNumber = phoneNumber;
        this.staffEmail = staffEmail;
        this.hourly = hourly;
        this.workingHours = workingHours;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffaddresss() {
        return staffaddresss;
    }

    public void setStaffaddresss(String staffaddresss) {
        this.staffaddresss = staffaddresss;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public long getHourly() {
        return hourly;
    }

    public void setHourly(long hourly) {
        this.hourly = hourly;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public long salary() {
        return this.hourly*this.workingHours;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID='" + ID + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffaddresss='" + staffaddresss + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", hourly=" + hourly +
                ", workingHours=" + workingHours +
                '}';
    }
}
