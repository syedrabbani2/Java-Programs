public class ArraySum {

    public static int sumOfArray(int[] array) {
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        
        int sum = sumOfArray(array);
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
