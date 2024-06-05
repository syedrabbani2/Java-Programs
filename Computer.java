public class Computer {
    
    private String brand;
    private String model;
    private double price;

  
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        
        Computer computer = new Computer("Dell", "Inspiron", 70000);
        
        
        System.out.println("Initial Details:");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("Price: Rs." + computer.getPrice());

       
        computer.setPrice(70000);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("Price: Rs." + computer.getPrice());
    }
}
