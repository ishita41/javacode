import java.util.Scanner;

public class binarysearchsearchinrotatedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] a = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Read the target element to search for
        int target = sc.nextInt();

        // Close the scanner
        sc.close();

        // Perform the search and print the result
        int result = searchInRotatedArray(a, target);
        System.out.println(result);
    }

    public static int searchInRotatedArray(int[] a, int target) {
        int s = 0;
        int e = a.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (a[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (a[s] <= a[mid]) {
                if (a[s] <= target && target < a[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                if (a[mid] < target && target <= a[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
