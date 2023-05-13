package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _08_BrowserHistoryUpgraded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        String command = scanner.nextLine();
        while (!command.equals("Home")) {
            if (command.equals("forward") && forwardStack.isEmpty()) {
                System.out.println("no next URLs");
            } else if (command.equals("back") && backStack.size() <= 1) {
                System.out.println("no previous URLs");
            } else if (command.equals("forward")) {
                backStack.push(forwardStack.peek());
                System.out.println(forwardStack.pop());
            } else if (command.equals("back")) {
                forwardStack.push(backStack.pop());
                System.out.println(backStack.peek());
            } else {
                forwardStack.clear();
                System.out.println(command);
                backStack.push(command);
            }
            command = scanner.nextLine();
        }
    }
}
