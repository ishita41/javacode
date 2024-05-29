import java.util.Scanner;

public class binarysearchupperbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int s = 0;
        int e = n - 1;
        int ans = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] > t) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
