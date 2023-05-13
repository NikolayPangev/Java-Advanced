package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0){
            System.out.println(0);
        } else {
            while (number > 0){
                stack.push(number % 2);
                number /= 2;
            }
        }

        while (stack.size() > 0){
            System.out.print(stack.pop());
        }
    }
}
