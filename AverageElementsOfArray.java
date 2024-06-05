public class AverageElementsOfArray {
    public static void main(String[] args) {
        
        int[] numbers = {5, 8, 3, 12, 9, 6, 15, 2};

        
        int sum = 0;

        
        for (int number : numbers) {
            sum += number;
        }

     
        double average = (double) sum / numbers.length;

      
        System.out.println("Average of elements in the array: " + average);
    }
}
