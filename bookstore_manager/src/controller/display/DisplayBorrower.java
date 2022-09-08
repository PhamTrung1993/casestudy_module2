package controller.display;

public class DisplayBorrower {
    public void displayBorrower(String borrowerID, String borrowerName, String address, String phoneNumber, String email) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Borrower id","Borrower Name","Bo Address","Staff phone number","Staff email" );
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",borrowerID,borrowerName,address,phoneNumber,email);
    }
}
