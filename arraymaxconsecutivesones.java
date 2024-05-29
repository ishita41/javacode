import java.util.Scanner;
import java.util.*;

public class arraymaxconsecutivesones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxi = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxi = Math.max(maxi, count);
        }
        System.out.println(maxi);
    }
}
