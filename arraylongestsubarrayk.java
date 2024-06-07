import java.util.Scanner;
import java.util.*;

public class arraylongestsubarrayk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> mp = new HashMap<>();
        int len = 0, maxlen = 0, rem = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            rem = sum - k;
            if (mp.containsKey(rem)) {
                len = i - mp.get(rem);
                maxlen = Math.max(maxlen, len);
            }
            if (!mp.containsKey(rem)) {
                mp.put(sum, i);
            }
        }
        System.out.println(maxlen);
    }
}
