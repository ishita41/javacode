import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ete552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input reading
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Calling the method to get the count of good subarrays
        int result = countGoodSubarrays(arr, s);
        System.out.println(result);
    }

    public static int countGoodSubarrays(int[] arr, int s) {
        int n = arr.length;
        int left = 0, right = 0;
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Iterate with the right pointer
        while (right < n) {
            // Add the current element to the map
            freqMap.put(arr[right], freqMap.getOrDefault(arr[right], 0) + 1);

            // Check if the window is valid (contains exactly s distinct integers)
            while (freqMap.size() > s) {
                freqMap.put(arr[left], freqMap.get(arr[left]) - 1);
                if (freqMap.get(arr[left]) == 0) {
                    freqMap.remove(arr[left]);
                }
                left++;
            }

            // If the window is valid, count the subarrays
            if (freqMap.size() == s) {
                count += (right - left + 1);
            }

            // Move the right pointer
            right++;
        }

        return count;
    }
}
