import java.util.Scanner;

public class binarysearchsqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int e = n;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid <= n / mid) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
