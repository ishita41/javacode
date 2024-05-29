import java.util.Scanner;

public class arraystockandbuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int buy = a[0], profit = 0;
        for (int i = 0; i < n; i++) {
            if (buy > a[i]) {
                buy = a[i];
            } else if (a[i] - buy > profit)
                profit = a[i] - buy;
        }
        System.out.println(profit);
    }
}
