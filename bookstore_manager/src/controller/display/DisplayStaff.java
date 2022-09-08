package controller.display;

public class DisplayStaff {
    public void displayStaff(String ID, String staffName, String staffaddresss, String phoneNumber, String staffEmail,long hourly,int workingHours) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n","Staff id","Staff Name","Staff Address","Staff phone number","Staff email","staff's hourly wages","working hours of staff" );
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",ID,staffName,staffaddresss,staffEmail,phoneNumber,hourly,workingHours);
    }
}
