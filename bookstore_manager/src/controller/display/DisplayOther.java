package controller.display;

public class DisplayOther {
    public void displayOther(String ID, String name, String category, String origin, long price,int amount) {
        System.out.printf("%-15s%-15s%-15s%-10s%-10s\n", "Other ID","Other Name", "Category","Origin","Other Price","Other Amount");
        System.out.printf("%%-15s%-15s%-15s%-10s%-10s\n", ID, name, category, origin, price,amount);
    }
}
