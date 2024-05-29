import java.util.Scanner;

public class arraymajorityelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ele = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = a[i];
                count++;
            } else if (ele == a[i]) {
                count++;
            } else {
                count--;
            }
        }
        int majority = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == ele) {
                majority++;
            }
        }
        if (majority > n / 2)
            System.out.println(ele);
    }
}
