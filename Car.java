public class Car {
    
    private String model;
    private String color;
    private double price;

  
    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        
        Car car = new Car("Benz", "white", 7500000.0);
        
      
        System.out.println("Initial Details:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: Rs." + car.getPrice());

        
        car.setColor("Red");
        car.setPrice(8000000.0);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: Rs" + car.getPrice());
    }
}
