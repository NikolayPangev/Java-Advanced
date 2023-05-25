package MultidimensionalArrays_Exercise;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensionsInput = scanner.nextLine();
        int rows = Integer.parseInt(dimensionsInput.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensionsInput.split("\\s+")[1]);

        String [][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = parts[j];
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            if (validateCommand(command, rows, cols)) {
                String[] commandParts = command.split("\\s+");

                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);

                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                PrintMatrix(matrix, rows, cols);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static void PrintMatrix(String[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {
        String[] commandParts = command.split("\\s+");
        if (commandParts.length != 5) {
            return false;
        }
        if (!commandParts[0].equals("swap")) {
            return false;
        }

        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 > rows || row2 < 0 || row2 > rows || col1 < 0 || col1 > cols || col2 < 0 || col2 > cols) {
            return false;
        }
        return true;
    }
}
