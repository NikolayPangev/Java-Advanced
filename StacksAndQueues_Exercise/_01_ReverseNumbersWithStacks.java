package StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_ReverseNumbersWithStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String numbers = scanner.nextLine();
        String[] inputNumbers = numbers.split("\\s+");

        for (String number : inputNumbers) {
            stack.push(number);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
