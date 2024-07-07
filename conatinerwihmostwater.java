import java.util.Scanner;
import java.util.*;

public class conatinerwihmostwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0, right = n - 1, area = 0;
        int maxi = 0;
        while (left < right) {
            area = Math.min(a[left], a[right]) * (right - left);
            maxi = Math.max(area, maxi);
            if (a[left] < a[right])
                left++;
            else
                right--;
        }
        System.out.println(maxi);
    }
}
