package view.menu;

import java.util.Scanner;

public class InputValue {
    public static String enterNameForm() {
        Scanner scanner = new Scanner(System.in);
        String value;
        System.out.println("--------------- ENTER NAME FORM -----------------");
        System.out.print("Enter Name: ");
        value = scanner.nextLine();
        return value;
    }
    public static String enterIDForm() {
        Scanner scanner = new Scanner(System.in);
        String value;
        System.out.println("--------------- ENTER ID FORM -----------------");
        System.out.print("Enter ID: ");
        value = scanner.nextLine();
        return value;
    }
}
