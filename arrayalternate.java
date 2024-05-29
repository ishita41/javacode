import java.util.Scanner;

public class arrayalternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                ans[pos] = a[i];
                pos += 2;
            } else {
                ans[neg] = a[i];
                neg += 2;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
