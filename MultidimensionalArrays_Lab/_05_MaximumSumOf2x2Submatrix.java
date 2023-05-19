package MultidimensionalArrays_Lab;

import java.util.Scanner;

public class _05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(inputArray[0]);
        int cols = Integer.parseInt(inputArray[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                sum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex + 1]);
        System.out.println(matrix[rowIndex + 1][colIndex] + " " + matrix[rowIndex + 1][colIndex + 1]);
        System.out.println(maxSum);
    }
}




