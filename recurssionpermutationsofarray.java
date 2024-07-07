import java.util.*;

class recursionpermutationofarray {

    public static void printt(int[] a, int idx, List<Integer> ds, List<List<Integer>> ans) {
        if (idx == a.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < a.length; i++) {
            swap(a, idx, i);
            ds.add(a[idx]);
            printt(a, idx + 1, ds, ans);
            ds.remove(ds.size() - 1);
            swap(a, idx, i);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        printt(a, 0, ds, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        recursionpermutationofarray obj = new recursionpermutationofarray();
        List<List<Integer>> res = obj.permute(a);

        System.out.println("Permutations:");
        for (List<Integer> perm : res) {
            System.out.println(perm);
        }
    }
}
