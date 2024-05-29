import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class arrayunion {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * 
         * int n = sc.nextInt();
         * int a[] = new int[n];
         * 
         * for (int i = 0; i < n; i++) {
         * a[i] = sc.nextInt();
         * }
         * 
         * 
         * int m = sc.nextInt();
         * int b[] = new int[m];
         * 
         * 
         * for (int i = 0; i < m; i++) {
         * b[i] = sc.nextInt();
         * }
         * 
         * 
         * int c[] = new int[n + m];
         * 
         * 
         * for (int i = 0; i < n; i++) {
         * c[i] = a[i];
         * }
         * 
         * 
         * for (int i = 0; i < m; i++) {
         * c[n + i] = b[i];
         * }
         * 
         * 
         * for (int i = 0; i < n + m; i++) {
         * System.out.print(c[i] + " ");
         * }
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        for (int el : set) {
            System.out.print(el + " ");
        }
    }
}
