package MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(parts[col]);
            }
        }

        //finding sum of first diagonal
        int sumFirstDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumFirstDiagonal += matrix[i][j];
                }
            }
        }

        //finding sum of secondDiagonal
        int sumSecondDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (i + j == n - 1) {
                    sumSecondDiagonal += matrix[i][j];
                }
            }
        }
        int difference = Math.abs(sumFirstDiagonal - sumSecondDiagonal);
        System.out.println(difference);
    }
}
