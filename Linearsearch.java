import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
