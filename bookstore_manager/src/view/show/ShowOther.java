package view.show;

import controller.function.OtherFunction;
import controller.function.StaffFunction;
import model.Other;
import model.Staff;
import storage.other.ReadWriteFileOther;
import storage.staff.ReadWriteFileStaff;
import view.Main;
import view.menu.OtherMenu;
import view.menu.StaffMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowOther {
    private static final int BACK_MAIN_MENU = 9;
    private static final int LOAD_DATA_CODE = 8;
    private static final int SAVE_DATA_CODE = 7;
    private static final int SORT_OTHER_BY_ID = 6;
    private static final int SEARCH_OTHER_BY_ID = 5;
    private static final int DISPLAY_ALL_OTHER = 4;
    private static final int REMOVE_OTHER_BY_NAME = 3;
    private static final int EDIT_OTHER_BY_ID = 2;
    private static final int ADD_OTHER = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;
    public static List<Other> initOther() {
        List<Other> otherList = new ArrayList<>();
        Other other1 = new Other("T01","Ditch 14","newspaper","Gossip team",10000,10);
        Other other2 = new Other("T02","leangue of legend","magazine","Gossip team",100000,10);
        otherList.add(other1);
        otherList.add(other2);
        return otherList;
    }
    public static void menuOfOther() throws IOException {
        OtherFunction otherFunction = new OtherFunction();
        OtherMenu otherMenu = new OtherMenu();
        ReadWriteFileOther readWriteFileOther = new ReadWriteFileOther();
        List<Other> otherList = initOther();
        int option = INIT_VALUE;

        while (option != EXIT_PROGRAM) {
            option = otherMenu.menu();
            switch (option) {

                case EXIT_PROGRAM :
                    System.exit(EXIT_PROGRAM);
                    break;
                case ADD_OTHER:
                    otherList.add(otherMenu.createOtherForm());
                    break;
                case EDIT_OTHER_BY_ID:
                    otherFunction.editOtherfByID(otherList);
                    break;
                case REMOVE_OTHER_BY_NAME:
                    otherFunction.deleteOtherByID(otherList);
                    break;
                case DISPLAY_ALL_OTHER:
                    otherMenu.displayAllOthers(otherList);
                    break;
                case SEARCH_OTHER_BY_ID:
                    otherFunction.searchOtherbyID(otherList);
                    break;
                case SORT_OTHER_BY_ID:
                    otherFunction.sortOtherByID(otherList);
                    break;
                case SAVE_DATA_CODE :
                    readWriteFileOther.writeData(otherList);
                    break;
                case LOAD_DATA_CODE :
                    otherList = readWriteFileOther.readData();
                    break;

                case BACK_MAIN_MENU :
                    Main.mainMenu();
                    break;
                default : System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}
