package SetsAndMapsAdvanced_Exercise;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_SetsOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int sizeOfFirstSet = Integer.parseInt(input[0]);
        int sizeOfSecondSet = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int number = 0; number < sizeOfFirstSet; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }

        for (int number = 0; number < sizeOfSecondSet; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(number -> System.out.print(number + " "));
    }
}
