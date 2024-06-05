public class LibraryBook {
    
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public static void main(String[] args) {
        
        LibraryBook book = new LibraryBook("To Kill a Mockingbird", "Harper Lee", 12.99, true);
        
        
        System.out.println("Initial Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs." + book.getPrice());
        System.out.println("Available: " + book.isAvailable());

       
        book.setAvailable(false);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs." + book.getPrice());
        System.out.println("Available: " + book.isAvailable());
    }
}
