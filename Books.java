package Library;

public class Books {
    String bookTitle;
    String bookAuthor;
    double price;
    boolean bookAvailability;

    public Books(String title, String author, double price, boolean isAvailable) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.price = price;
        this.bookAvailability = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                ", bookAvailability=" + bookAvailability +
                '}';
    }
}
