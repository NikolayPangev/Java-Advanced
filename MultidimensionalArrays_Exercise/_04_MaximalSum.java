package MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(inputData[0]);
        int cols = Integer.parseInt(inputData[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        System.out.println(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex + 1] + " " + matrix[rowIndex][colIndex + 2]);
        System.out.println(matrix[rowIndex + 1][colIndex] + " " + matrix[rowIndex + 1][colIndex + 1] + " " + matrix[rowIndex + 1][colIndex + 2]);
        System.out.println(matrix[rowIndex + 2][colIndex] + " " + matrix[rowIndex + 2][colIndex + 1] + " " + matrix[rowIndex + 2][colIndex + 2]);

    }
}
