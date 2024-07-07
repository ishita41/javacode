import java.util.Scanner;

public class arraysortedornotusingrecursiion {
    static Boolean sorted(int a[], int idx, int n) {
        if (idx == n - 1)
            return true;
        return a[idx] < a[idx + 1] && sorted(a, idx + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (sorted(a, 0, n))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
