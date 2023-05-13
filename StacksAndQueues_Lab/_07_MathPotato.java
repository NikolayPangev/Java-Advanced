package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, names);

        int currentCount = 1;
        while (kids.size() > 1) {
            for (int i = 1; i < count; i++) {
                String kid = kids.poll();
                kids.offer(kid);
            }

            if (isPrime(currentCount)) {
                System.out.println("Prime " + kids.peek());
            } else {
                String removedChild = kids.poll();
                System.out.println("Removed " + removedChild);
            }
            currentCount++;
        }
        System.out.println("Last is " + kids.poll());
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
