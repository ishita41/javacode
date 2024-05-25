import java.util.Scanner;

public class arrayrightrotatebyk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
