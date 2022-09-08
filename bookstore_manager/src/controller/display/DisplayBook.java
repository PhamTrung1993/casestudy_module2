package controller.display;

public class DisplayBook {
    public void displayBook(String bookID, String bookTitle, String bookName, String category, String writingMaster, String status, long rentCost,long bookPrice) {
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", "Book ID", "Book Title", "Book Name", "Category","Writing Master","status","rent Cost","Book Price");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", bookID,bookTitle,bookName,category,writingMaster,status,rentCost,bookPrice);
    }
}
