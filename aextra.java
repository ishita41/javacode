import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class aextra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                ans = i;
                break;
            } else {
                ans = -1;
            }
        }
        System.out.println(ans);
    }
}