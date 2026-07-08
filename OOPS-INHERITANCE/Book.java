import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Author Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Author author = new Author(authorName, email, gender);
        Book book = new Book(bookName, author, price, qty);

        System.out.println("\nBook Details");
        System.out.println("Book Name: " + book.name);
        System.out.println("Price: " + book.price);
        System.out.println("Quantity: " + book.qtyInStock);
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Email: " + author.getEmail());
        System.out.println("Author Gender: " + author.getGender());

        sc.close();
    }
}