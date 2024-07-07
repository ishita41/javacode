import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class combinationsum {
    public void findSum(int idx, int target, int csum, int[] candidates, List<List<Integer>> ans, List<Integer> ds) {
        if (idx == candidates.length) {
            if (csum == target) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // Include the current element in the combination
        if (csum + candidates[idx] <= target) {
            ds.add(candidates[idx]);
            findSum(idx, target, csum + candidates[idx], candidates, ans, ds);

            ds.remove(ds.size() - 1);
        }

        // Skip the current element and move to the next
        findSum(idx + 1, target, csum, candidates, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSum(0, target, 0, candidates, ans, ds);
        return ans;
    }

    public static void main(String[] args) {
        combinationsum solution = new combinationsum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candidates:");
        int numCandidates = sc.nextInt();
        int[] candidates = new int[numCandidates];
        System.out.println("Enter " + numCandidates + " candidate values:");
        for (int i = 0; i < numCandidates; ++i) {
            candidates[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        List<List<Integer>> result = solution.combinationSum(candidates, target);

        System.out.println("Combinations that sum up to " + target + ":");
        for (List<Integer> vec : result) {
            for (int num : vec) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
