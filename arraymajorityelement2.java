import java.util.Scanner;

public class arraymajorityelement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count1 = 0, count2 = 0, ele1 = 0, ele2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (count1 == 0) {
                ele1 = a[i];
                count1++;
            }
            if (count2 == 0) {
                ele2 = a[i];
                count2++;
            } else if (ele1 == a[i])
                count1++;
            else if (ele2 == a[i])
                count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == ele1)
                count1++;
            if (a[i] == ele2)
                count2++;
        }
        if (count1 > n / 3) {
            System.out.println(ele1);
        } else if (count2 > n / 3)
            System.out.println(ele2);
    }
}
