import java.util.Arrays;
import java.util.Scanner;

public class leetcode1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = Arrays.copyOf(a, n);
        Arrays.sort(b);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
