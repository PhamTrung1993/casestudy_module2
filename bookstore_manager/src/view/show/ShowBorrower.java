package view.show;

import controller.function.BorrowerFunction;
import model.Borrower;
import storage.borrower.ReadWriteFileBorrower;
import view.Main;
import view.menu.BorrowerMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowBorrower {
    private static final int BACK_MAIN_MENU = 8;
    private static final int LOAD_DATA_CODE = 7;
    private static final int SAVE_DATA_CODE = 6;
    private static final int SEARCH_BORROWER_BY_ID = 5;
    private static final int DISPLAY_ALL_BORROWER = 4;
    private static final int REMOVE_BORROWER_BY_ID = 3;
    private static final int EDIT_BORROWER_BY_ID = 2;
    private static final int ADD_BORROWER = 1;
    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final int EXIT_PROGRAM = 0;
    private static final int INIT_VALUE = -1;
    public static List<Borrower> initBorrower() {
        List<Borrower> borrowerList = new ArrayList<>();
        Borrower borrower1 = new Borrower("C01","Mun","Hà Tây","0912121212","Mun@gmail.com");
        borrowerList.add(borrower1);
        return borrowerList;
    }
    public static void menuOfBorrower() throws IOException {
        BorrowerFunction borrowerFunction = new BorrowerFunction();
        BorrowerMenu staffMenu = new BorrowerMenu();
        ReadWriteFileBorrower readWriteFileBorrower = new ReadWriteFileBorrower();
        List<Borrower> borrowerList = initBorrower();
        int option = INIT_VALUE;

        while (option != EXIT_PROGRAM) {
            option = staffMenu.menu();
            switch (option) {

                case EXIT_PROGRAM :
                    System.exit(EXIT_PROGRAM);
                    break;
                case ADD_BORROWER:
                    borrowerList.add(staffMenu.createBorrowerForm());
                    break;
                case EDIT_BORROWER_BY_ID:
                    borrowerFunction.editBorrowerByID(borrowerList);
                    break;
                case REMOVE_BORROWER_BY_ID:
                    borrowerFunction.deleteBorrowerByID(borrowerList);
                    break;
                case DISPLAY_ALL_BORROWER:
                    staffMenu.displayAllStaffs(borrowerList);
                    break;
                case SEARCH_BORROWER_BY_ID:
                    borrowerFunction.searchBorrowerbyID(borrowerList);
                    break;
                case SAVE_DATA_CODE :
                    readWriteFileBorrower.writeData(borrowerList);
                    break;
                case LOAD_DATA_CODE :
                    borrowerList = readWriteFileBorrower.readData();
                    break;

                case BACK_MAIN_MENU :
                    Main.mainMenu();
                    break;
                default : System.out.println(INVALID_OPTION_STRING);
            }
        }
    }
}
