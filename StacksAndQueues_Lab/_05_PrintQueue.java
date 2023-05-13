package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_PrintQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String currentCommand = scanner.nextLine();

        while (!currentCommand.equals("print")) {
            if (currentCommand.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerQueue.poll());
                }
            } else {
                printerQueue.offer(currentCommand);
            }


            currentCommand = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
