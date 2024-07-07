import java.util.Scanner;

public class implementingstackusingarray {
    static class stack {
        int n = 1000;
        int a[] = new int[n];
        int top = -1;

        void push(int x) {
            top++;
            a[top] = x;
        }

        int pop() {
            int x = a[top];
            top--;
            return x;
        }

        int top() {
            return a[top];
        }

        int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        System.out.println(s.top());
    }
}
