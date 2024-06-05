public class MaxMinArray {
    public static void main(String[] args) {
        
        int[] numbers = {5, 8, 3, 12, 9, 6, 15, 2};

        
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
        }

        
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
