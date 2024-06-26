import java.util.Scanner;

public class recurssion6 {
    public static void print(int a[], int n) {
        if (n == 0)
            return;
        System.out.println(a[n - 1]);
        print(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        print(a, n);
    }
}
