import java.util.Scanner;

public class ete5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int totalcost = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= x) {
                totalcost += b[i];
            }
        }
        System.out.println(totalcost);
    }
}
