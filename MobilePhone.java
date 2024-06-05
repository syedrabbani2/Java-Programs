public class MobilePhone {

	private String brand;
	private String model;
	private double price;


	public MobilePhone(String brand, String model, double price) {
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

		MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 999.99);

		System.out.println("Initial Details:");
		System.out.println("Brand: " + phone.getBrand());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Price: $" + phone.getPrice());


		phone.setPrice(1099.99);


		System.out.println("\nUpdated Details:");
		System.out.println("Brand: " + phone.getBrand());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Price: $" + phone.getPrice());
	}
}
