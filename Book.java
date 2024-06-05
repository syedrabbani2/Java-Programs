public class Book {
    
    private String title;
    private String author;
    private double price;

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public static void main(String[] args) {
        
        Book book = new Book("The India Story", "Bimal jalal", 1700);
        
       
        System.out.println("Initial Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs." + book.getPrice());

        
        book.setPrice(199);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs." + book.getPrice());
    }
}
