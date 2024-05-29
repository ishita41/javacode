import java.util.Scanner;

public class arraykadanealgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0, csum = 0;
        for (int i = 0; i < n; i++) {
            csum += a[i];
            if (sum < csum)
                sum = csum;
            else if (csum < 0)
                csum = 0;
        }
        System.out.println(sum);
    }
}
