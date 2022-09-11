package view.menu;

import model.Other;
import model.Staff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class OtherMenu {
    public Other createOtherForm() throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">>>>>>>>ADD NEW OTHER<<<<<<<<<");
        System.out.print("1. Enter Other ID: ");
        String id = bufferedReader.readLine();
        System.out.print("1. Enter Other Name: ");
        String name = bufferedReader.readLine();
        System.out.print("1. Enter Other Category: ");
        String category = bufferedReader.readLine();
        System.out.print("1. Enter Other origin: ");
        String origin = bufferedReader.readLine();
        System.out.print("1. Enter Other Price: ");
        Long price = Long.parseLong(bufferedReader.readLine()) ;
        System.out.print("1. Enter Other Amount: ");
        int amount = Integer.parseInt(bufferedReader.readLine()) ;

        Other newOther = new Other(id,name,category,origin,price,amount );
        return newOther;
    }
    public int menu() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("             OTHER MENU                  ");
        System.out.println("-------------------***-------------------");
        System.out.println("|    1. Add Other.                      |");
        System.out.println("|    2. Edit Other by ID.               |");
        System.out.println("|    3. Remove Other by ID.             |");
        System.out.println("|    4. Display Other.                  |");
        System.out.println("|    5. Search Other by ID.             |");
        System.out.println("|    6. Sort Other by ID                |");
        System.out.println("|    7. Save Other to database.         |");
        System.out.println("|    8. Load Other from database.       |");
        System.out.println("|    9. Back Main menu.                 |");
        System.out.println("|    0. Exit program.                   |");
        System.out.println("-----------------------------------------");
        System.out.print("  Select option: ");
        int option = Integer.parseInt(bufferedReader.readLine());
        return option;
    }
    public void displayAllOthers(List<Other> otherList) {
        System.out.println("############################ DISPLAY ALL GUESTROOM ##############################");
        Iterator<Other> iterator = otherList.iterator();
        while (iterator.hasNext()) {
            Other holder = iterator.next();
            System.out.printf("%%-15s%-15s%-15s%-10s%-10s\n",holder.getID(),holder.getName(),holder.getCategory(),holder.getOrigin(),holder.getPrice(),holder.getAmount());
        }
        System.out.println("......................................................................................");
    }
}
