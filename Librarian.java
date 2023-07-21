package Library;

import Students.StudentManagement;

import java.util.Scanner;

public class Librarian extends BookManagement{
    public static void main(String[] args) {
        BookManagement monitor = new BookManagement();
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
            System.out.println("--------- Welcome To Book Management App ---------");
            System.out.println("1 - Add Book");
            System.out.println("2 - Remove Book");
            System.out.println("3 - Update Book");
            System.out.println("4 - Display all Books");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice: ");

            choice = scan.nextInt();

            switch (choice) {
                case 1 -> monitor.addBook(scan);
                case 2 -> monitor.removeBook(scan);
                case 3 -> monitor.updateBook(scan);
                case 4 -> monitor.searchBook();
                case 5 -> System.out.println("Exiting the program.");
                default -> System.out.println("invalid input.");
            }
        }
        while(choice != 5);
        scan.close();
    }
}
