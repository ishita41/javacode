import java.util.ArrayList;
import java.util.Scanner;

public class ete69 {

    public static void findZeroSumSubarrays(int[] arr) {
        int n = arr.length;
        boolean found = false;

        // Iterate through each possible starting index
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // Check all subarrays starting from index i
            for (int j = i; j < n; j++) {
                sum += arr[j];
                // If sum is zero, print the subarray
                if (sum == 0) {
                    found = true;
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        // If no subarray found with zero sum, print -1
        if (!found) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findZeroSumSubarrays(arr);
        sc.close();
    }
}
