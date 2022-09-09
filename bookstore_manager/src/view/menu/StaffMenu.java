package view.menu;

import model.Staff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class StaffMenu {
    public Staff createStaffForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW STAFF<<<<<<<<<");
        System.out.print("1. Enter Staff ID: ");
        String id = bufferedReader.readLine();
        System.out.print("1. Enter Staff Name: ");
        String name = bufferedReader.readLine();
        System.out.print("1. Enter Staff Address: ");
        String address = bufferedReader.readLine();
        System.out.print("1. Enter Staff Phone number: ");
        String phonenumber = bufferedReader.readLine();
        System.out.print("1. Enter Staff Email: ");
        String email = bufferedReader.readLine();
        System.out.print("1. Enter Houly Wages: ");
        Long hourly = Long.parseLong(bufferedReader.readLine()) ;
        System.out.print("1. Enter Working Hours: ");
        int workingHours = Integer.parseInt(bufferedReader.readLine());


        Staff newStaff = new Staff(id,name,address,phonenumber,email,hourly,workingHours);
        return newStaff;
    }
    public int menu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("             STAFF MANAGER               ");
        System.out.println("-------------------***-------------------");
        System.out.println("|    1. Add Staff.                      |");
        System.out.println("|    2. Edit Staff by Name.             |");
        System.out.println("|    3. Remove Staff by Name.           |");
        System.out.println("|    4. Display Staff.                  |");
        System.out.println("|    5. Search Staff by ID.             |");
        System.out.println("|    6. Check Salary of Staff by ID.    |");
        System.out.println("|    7. Save Staff to database.         |");
        System.out.println("|    8. Load Staff from database.       |");
        System.out.println("|    9. Back Main menu.                 |");
        System.out.println("|    0. Exit program.                   |");
        System.out.println("-----------------------------------------");
        System.out.print("  Select function: ");
        int option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllStaffs(List<Staff> staffList) {
        System.out.println("############################ DISPLAY ALL GUESTROOM ##############################");
        Iterator<Staff> iterator = staffList.iterator();
        while (iterator.hasNext()) {
            Staff holder = iterator.next();
            System.out.printf("%-5s%-10s%-10s%-15s%-20s%-10s%-10s\n", holder.getID(),holder.getStaffName(),holder.getStaffaddresss(),
                    holder.getPhoneNumber(),holder.getStaffEmail(),holder.getHourly(),holder.getWorkingHours());
        }
        System.out.println("......................................................................................");
    }
}
