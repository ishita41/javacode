import java.util.Scanner;
import java.util.Stack;

public class stockspanproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of days
        int n = sc.nextInt();

        // Input stock prices for each day
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Array to store spans
        int[] spans = new int[n];

        // Stack to store indices of stock prices
        Stack<Integer> stack = new Stack<>();

        // Calculate spans for the first day
        spans[0] = 1;
        stack.push(0); // Push index of the first day

        // Calculate spans for the rest of the days
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while the price of the stock at index
            // stack.peek() is less than or equal to prices[i]
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span using if-else statement
            if (stack.isEmpty()) {
                spans[i] = i + 1; // If stack is empty, all previous days have prices greater than prices[i]
            } else {
                spans[i] = i - stack.peek(); // Otherwise, compute the span based on the index on top of stack
            }

            // Push current index onto the stack
            stack.push(i);
        }

        // Output spans for each day
        System.out.println("Stock Spans:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + ": " + spans[i]);
        }

        sc.close();
    }
}
