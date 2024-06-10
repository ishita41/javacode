import java.util.ArrayList;
import java.util.Scanner;

public class arrayleaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> leaders = new ArrayList<>();
        int maxi = a[n - 1];
        leaders.add(maxi);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxi) {
                leaders.add(a[i]);
                maxi = a[i];
            }
        }

        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.println(leaders.get(i));
        }
    }
}
