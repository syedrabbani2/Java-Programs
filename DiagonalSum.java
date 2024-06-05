public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = findDiagonalSum(matrix);

        System.out.println("Sum of diagonal elements: " + sum);
    }

    
    public static int findDiagonalSum(int[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

       
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i]; 
            sum += matrix[i][cols - 1 - i]; 
        }

        if (rows % 2 == 1) {
            sum -= matrix[rows / 2][cols / 2];
        }

        return sum;
    }
}
