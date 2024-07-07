import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class combinationsum2 {
    public static void findSum(int idx, int[] a, List<Integer> dl, List<List<Integer>> ans, int sum, int csum) {
        if (csum == sum) {
            ans.add(new ArrayList<>(dl));
            return;
        }
        if (idx >= a.length || csum > sum) {
            return;
        }

        for (int i = idx; i < a.length; i++) {
            // Skip duplicates
            if (i > idx && a[i] == a[i - 1])
                continue;

            // Include the current element in the combination
            dl.add(a[i]);
            findSum(i + 1, a, dl, ans, sum, csum + a[i]);
            dl.remove(dl.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int sum = sc.nextInt();

        Arrays.sort(a); // Sort the array to handle duplicates

        List<List<Integer>> ans = new ArrayList<>();
        findSum(0, a, new ArrayList<>(), ans, sum, 0);

        System.out.println("Unique combinations are:");
        for (List<Integer> combination : ans) {
            System.out.println(combination);
        }
    }
}
