package model;

import java.io.Serializable;

public class Borrower implements Serializable {
    private String borrowerID;
    private String borrowerName;
    private String address;
    private String phoneNumber;
    private String email;

    public Borrower() {
    }

    public Borrower(String borrowerID, String borrowerName, String address, String phoneNumber, String email) {
        this.borrowerID = borrowerID;
        this.borrowerName = borrowerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(String borrowerID) {
        this.borrowerID = borrowerID;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BookBorrower{" +
                "borrowerID='" + borrowerID + '\'' +
                ", borrowerName='" + borrowerName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
