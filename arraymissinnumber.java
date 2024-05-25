import java.util.Scanner;

public class arraymissinnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = n * (n + 1) / 2;
        int asum = 0;
        for (int i = 0; i < n; i++) {
            asum += a[i];
        }
        System.out.println(sum - asum);
    }
}
