package class15;

public class Book {
    private String title;
    private String publisher;
    private String author;
    private int noOfPages;
    private double price;

    public Book(String title, String publisher, String author, int noOfPages) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.noOfPages = noOfPages;

    }

    public Book(String title, String publisher, String author, int noOfPages, double price) {
        this(title,publisher,author,noOfPages);
        this.price = price;
    }

    public void printInfo (){
        System.out.println(title+" "+publisher+" "+author+" "+noOfPages);
    }
    public void printAllInfo(){
        System.out.println(title+" "+publisher+" "+author+" "+noOfPages+" "+price);
    }

    public static void main(String[] args) {
        new Book("Harry Potter", "Rouling", "Rouling", 600).printInfo();
        new Book("Harry Potter", "Rouling", "Rouling", 600, 45).printAllInfo();
    }
}
