import java.util.Scanner;

public class ete6622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0, rem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                ans += a[i] / 2;
            } else {
                ans += a[i] / 2;
                rem = a[i] % 2;
                if (i + 1 < n) {
                    a[i + 1] += rem;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
