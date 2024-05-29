import java.util.Scanner;

public class binarysearch {
    public static int binarysearchh(int a[], int n, int target) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == target)
                return mid;
            else if (a[mid] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarysearchh(a, n, target));
    }
}
