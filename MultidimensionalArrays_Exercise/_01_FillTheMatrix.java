package MultidimensionalArrays_Exercise;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split(", ");
        int size = Integer.parseInt(inputData[0]);
        String pattern = inputData[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            //method A
            FillMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            //method B
            FillMatrixPatternB(matrix);
        }

        PrintMatrix(matrix);

    }
    private static void PrintMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void FillMatrixPatternA(int [][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }
    }

    private static void FillMatrixPatternB(int[][] matrix) {
        int startNumber = 1;
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 == 0){
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            } else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            }
        }
    }
}
