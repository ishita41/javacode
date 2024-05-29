import java.util.Scanner;

public class pascaltriangle2 {
    public static int ncr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void pascalt(int n) {
        for (int i = 1; i <= n; i++) {
            int ans = ncr(n - 1, i - 1);
            System.out.println(ans);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalt(n);
    }
}
