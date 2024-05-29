import java.util.Scanner;

public class array012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = 0, mid = 0, e = n - 1;
        while (mid <= e) {
            if (a[mid] == 0) {
                int temp = a[s];
                a[s] = a[mid];
                a[mid] = temp;
                mid++;
                s++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[e];
                a[e] = a[mid];
                a[mid] = temp;
                e--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
