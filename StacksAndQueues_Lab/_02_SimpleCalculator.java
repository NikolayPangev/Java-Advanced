package StacksAndQueues_Lab;

import java.util.*;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");
        List<String> partsList = Arrays.asList(expressionParts);

        Collections.reverse(partsList);

        for (String part : partsList) {
            stack.push(part);
        }

        while (stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            int result = 0;
            switch (operation){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                default:
                    System.out.println("Unknown operation " + operation);
                    return;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
