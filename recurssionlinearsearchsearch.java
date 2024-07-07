import java.util.Scanner;

public class recurssionlinearsearchsearch {
    static int search(int a[], int t, int i, int n) {
        if (i == n)
            return -1;
        if (a[i] == t)
            return i;
        else
            return search(a, t, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(search(a, t, 0, n));
    }
}
