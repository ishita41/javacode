import java.util.Scanner;

public class fibbonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        System.out.print(0 + " ");
        for (int i = 2; i <= n; i++) {
            int ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
            System.out.print(prev2 + " ");
        }

    }
}
