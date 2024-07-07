import java.util.Scanner;

class recurssionrotatearraysearch {
    static int search(int a[], int t, int s, int e) {
        if (s > e)
            return -1;
        int m = (s + e) / 2;
        if (a[m] == t)
            return m;
        if (a[s] <= a[m]) {
            if (t >= a[s] && t <= a[m]) {
                return search(a, t, s, m - 1);
            } else {
                return search(a, t, m + 1, e);
            }
        }
        if (t >= a[m] && t <= a[e]) {
            return search(a, t, m + 1, e);
        } else {
            return search(a, t, s, m - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(search(a, t, 0, n - 1));
        sc.close();
    }
}
