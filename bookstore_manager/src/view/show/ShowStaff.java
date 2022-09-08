package view.show;

import controller.function.StaffFunction;
import model.Staff;
import storage.staff.ReadWriteFileStaff;
import view.Main;
import view.menu.StaffMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowStaff {
    private static final int BACK_MAIN_MENU = 9;
    private static final int LOAD_DATA_CODE = 8;
    private static final int SAVE_DATA_CODE = 7;
    private static final int SEARCH_STAFF_BY_NAME = 6;
    private static final int SEARCH_STAFF_BY_ID = 5;
    private static final int DISPLAY_ALL_STAFF = 4;
    private static final int REMOVE_STAFF_BY_NAME = 3;
    private static final int EDIT_STAFF_BY_ID = 2;
    private static final int ADD_STAFF = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;
    public static List<Staff> initStaff() {
        List<Staff> staffList = new ArrayList<>();
        Staff staff1 = new Staff("S01","Tuyết","Hà Đông","0911111111","tuyet@gmail.com",50000,150);
        staffList.add(staff1);
        return staffList;
    }
    public static void menuOfStaff() throws IOException {
        StaffFunction staffFunction = new StaffFunction();
        StaffMenu staffMenu = new StaffMenu();
        ReadWriteFileStaff readWriteFileStaff = new ReadWriteFileStaff();
        List<Staff> staffList = initStaff();
        int option = INIT_VALUE;

        while (option != EXIT_PROGRAM) {
            option = staffMenu.menu();
            switch (option) {

                case EXIT_PROGRAM :
                    System.exit(EXIT_PROGRAM);
                    break;
                case ADD_STAFF:
                    staffList.add(staffMenu.createStaffForm());
                    break;
                case EDIT_STAFF_BY_ID:
                    staffFunction.editStaffByID(staffList);
                    break;
                case REMOVE_STAFF_BY_NAME:
                    staffFunction.deleteStaffByName(staffList);
                    break;
                case DISPLAY_ALL_STAFF:
                    staffMenu.displayAllStaffs(staffList);
                    break;
                case SEARCH_STAFF_BY_ID:
                    staffFunction.searchStaffbyID(staffList);
                    break;
                case SEARCH_STAFF_BY_NAME:
                    staffFunction.searchStaffbyName(staffList);
                    break;
                case SAVE_DATA_CODE :
                    readWriteFileStaff.writeData(staffList);
                    break;
                case LOAD_DATA_CODE :
                    List<Staff> newReadWriteFileStaff = readWriteFileStaff.readData();
                    for (Staff staff: newReadWriteFileStaff) {
                        System.out.println(staff);
                    }
                    break;

                case BACK_MAIN_MENU :
                    Main.mainMenu();
                    break;
                default : System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}
