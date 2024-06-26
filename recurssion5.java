import java.util.Scanner;

public class recurssion5 {
    public static void print(int a[], int n) {
        if (n == 0)
            return;
        print(a, n - 1);
        System.out.println(a[n - 1]);
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
