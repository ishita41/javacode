import java.util.Scanner;

public class ete71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        String t = sc.nextLine();
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int cmp = t.compareTo(a[mid]);
            if (cmp == 0) {
                System.out.println(mid);

                return;
            } else if (cmp > 0)
                s = mid + 1;
            else
                e = mid - 1;
        }
        System.out.println(-1);
    }
}
