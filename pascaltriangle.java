import java.util.Scanner;

public class pascaltriangle {
    public static int ncr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static int pascal(int r, int c) {
        int ele = ncr(r - 1, c - 1);
        return ele;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = pascal(n, r);
        System.out.println(ans);
    }
}
