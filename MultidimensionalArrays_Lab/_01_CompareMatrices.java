package MultidimensionalArrays_Lab;

import java.util.Scanner;

public class _01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        int firstRows = Integer.parseInt(inputArray[0]);
        int firstCols = Integer.parseInt(inputArray[1]);

        int[][] firstMatrix = new int[firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < firstCols; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        inputArray = scanner.nextLine().split(" ");

        int secondRows = Integer.parseInt(inputArray[0]);
        int secondCols = Integer.parseInt(inputArray[1]);

        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int i = 0; i < secondRows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < secondCols; j++) {
                secondMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        if (firstRows != secondRows || firstCols != secondCols) {
            System.out.println("not equal");
            return;
        }

        boolean areEqual = true;

        for (int i = 0; i < firstRows; i++) {
            for (int j = 0; j < firstCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    areEqual = false;
                    break;
                }
            }
            if (!areEqual){
                break;
            }
        }

        if (areEqual){
            System.out.println("equal");
        } else {
            System.out.println("not equal");

        }
    }
}
