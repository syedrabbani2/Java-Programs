public class PascalsTriangle {

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 5; 
        printPascalsTriangle(numRows);
    }
}
