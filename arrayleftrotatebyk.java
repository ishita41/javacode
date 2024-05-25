import java.util.Scanner;

public class arrayleftrotatebyk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n; // To handle cases where k >= n

        // Rotate the array to the left by k positions
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n - 1] = temp;
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
