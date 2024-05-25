import java.util.Scanner;

public class arraysorted {
    public static boolean issorted(int a[], int n) {
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (issorted(a, n))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
