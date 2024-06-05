public class Array {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

       
        double[] temperatures = new double[5];

       
        temperatures[0] = 25.5;
        temperatures[1] = 28.0;
        temperatures[2] = 30.2;
        temperatures[3] = 26.8;
        temperatures[4] = 29.3;

        
        System.out.println("\nTemperatures for the week:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + " °C");
        }

        
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

       
        System.out.println("\nFruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
        }
    }
}
