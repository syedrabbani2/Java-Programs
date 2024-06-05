import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name", "John");
        properties.setProperty("age", "30");
        properties.setProperty("city", "New York");

        System.out.println("Properties: " + properties);

        // Retrieving a value
        String name = properties.getProperty("name");
        System.out.println("Name: " + name);
    }
}
