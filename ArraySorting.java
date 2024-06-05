import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        
        Integer[] numbers = {5, 2, 8, 1, 6, 9, 3, 7, 4};

       
        Arrays.sort(numbers);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(numbers));

        
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array sorted in descending order: " + Arrays.toString(numbers));
    }
}
