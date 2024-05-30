import java.util.Scanner;

public class binarysearchcountoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                count++;
            }
        }
        System.out.println(count);
    }
}
