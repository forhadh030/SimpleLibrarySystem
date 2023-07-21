package Library;

import Students.Student;

import java.util.Scanner;

public class BookManagement implements BookServices{

    private static final int MAX_BOOK_LIMIT = 20;
    public static Books[] bookList = new Books[MAX_BOOK_LIMIT];
    public static int bookAvailability = 0;
    @Override
    public void addBook(Scanner scan) {
        if(bookAvailability >= MAX_BOOK_LIMIT) {
            System.out.println("Sorry, We're unable to accommodate any more space!");
            return;
        }
        System.out.print("Please enter the book title: ");
        String bookTitle = scan.nextLine();

        scan.nextLine();

        System.out.print("Please enter the author name: ");
        String bookAuthor = scan.nextLine();

        System.out.print("Please enter the price of the book: ");
        double bookPrice = scan.nextDouble();

        System.out.print("Is the book available? Please enter true or false: ");
        boolean isAvailable = scan.nextBoolean();

        Books book = new Books(bookTitle, bookAuthor, bookPrice, isAvailable);
        bookList[bookAvailability++] = book;
        System.out.print("Book added successfully!");
    }

    @Override
    public void updateBook(Scanner scan) {
        if(bookAvailability == 0) {
            System.out.println("No book available");
        }
        System.out.print("Enter the index of the book to update (0) to " + (bookAvailability - 1) + ": ");
        int index = scan.nextInt();

        if(index >= 0 && index < bookAvailability) {
            System.out.print("Enter new book name: ");
            String newBookTitle = scan.nextLine();

            System.out.print("Enter new book author: ");
            String newAuthorName = scan.nextLine();

            System.out.print("Enter new book price: ");
            double newBookPrice = scan.nextDouble();

            System.out.print("Enter new book price: ");
            boolean newBookAvailaibility = scan.nextBoolean();

            Books updatedBook = new Books(newBookTitle, newAuthorName, newBookPrice, newBookAvailaibility);
            bookList[index] = updatedBook;
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Invalid index; No book updated");
        }
    }

    @Override
    public void removeBook(Scanner scan) {
        if(bookAvailability == 0) {
            System.out.println("There are no book available to remove");
        }
        System.out.print("Enter the index of the book to remove (0) to " + (bookAvailability - 1) + ": ");
        int index = scan.nextInt();

        if(index >= 0 && index < bookAvailability) {
            for(int i = index; i < bookAvailability - 1; i++) {
                bookList[i] = bookList[i+1];
            }
            bookList[bookAvailability - 1] = null;
            bookAvailability--;
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Invalid index, No book removed.");
        }
    }

    @Override
    public void searchBook() {
        if(bookAvailability == 0) {
            System.out.println("No book available");
        }
        for(int i = 0; i < bookAvailability; i++) {
            System.out.println(i + 1 + ". ");
            System.out.println(bookList[i]);
        }
    }
}
