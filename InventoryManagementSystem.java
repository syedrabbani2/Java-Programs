import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<String, Integer> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }
        inventory.put(itemName, quantity);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String itemName) {
        if (inventory.containsKey(itemName)) {
            inventory.remove(itemName);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter item name:");
                    String itemName = scanner.nextLine();
                    System.out.println("Enter quantity:");
                    int quantity = scanner.nextInt();
                    ims.addItem(itemName, quantity);
                    break;
                case 2:
                    System.out.println("Enter item name to remove:");
                    String itemToRemove = scanner.nextLine();
                    ims.removeItem(itemToRemove);
                    break;
                case 3:
                    ims.displayInventory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}