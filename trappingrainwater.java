import java.util.Scanner;

public class trappingrainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int left = 0;
        int right = n - 1;
        int maxleft = 0, maxright = 0, res = 0;

        while (left <= right) {
            if (a[left] <= a[right]) {
                if (a[left] >= maxleft) {
                    maxleft = a[left];
                } else {
                    res += maxleft - a[left];
                }
                left++;
            } else {
                if (a[right] >= maxright) {
                    maxright = a[right];
                } else {
                    res += maxright - a[right];
                }
                right--;
            }
        }

        System.out.println(res);
    }
}
