import java.util.*;

public class binarysearchfirstandlastoccurance {
    public static int firstoccurance(int a[], int n, int t) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (t == a[mid]) {
                ans = mid;
                e = mid - 1;
            } else if (t > a[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static int lastoccurance(int a[], int n, int t) {
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (t == a[mid]) {
                ans = mid;
                s = mid + 1;
            } else if (t > a[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(firstoccurance(a, n, t));
        System.out.println(lastoccurance(a, n, t));
    }
}
