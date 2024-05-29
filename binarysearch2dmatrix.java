import java.util.Scanner;

public class binarysearch2dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int t = sc.nextInt();
        int s = 0;
        int e = m - 1;
        while (s < n && e >= 0) {
            int temp = a[s][e];
            if (temp == t) {
                System.out.println(s + " " + e);
                return;
            } else if (temp > t) {
                e--;
            } else {
                s++;
            }
        }
        System.out.println(-1);
    }
}
