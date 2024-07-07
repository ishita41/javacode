import java.util.Scanner;

public class leetcode1342 {
    static int countno(int n, int steps) {
        if (n == 0)
            return steps;
        else if (n % 2 == 0) {
            return countno(n / 2, steps + 1);
        } else {
            return countno(n - 1, steps + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countno(n, 0));
    }
}
