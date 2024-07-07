import java.util.Scanner;

public class ete664 {
    public static int solve(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = solve(a[0]);
        boolean flag = true;
        for (int i = 1; i < n; i++) {
            if (solve(a[i]) != ans) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
