import java.util.ArrayList;
import java.util.List;

public class arrayunion2 {
    public static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6};
        int n = arr1.length;
        int m = arr2.length;
        
        List<Integer> union = findUnion(arr1, arr2, n, m);
        System.out.println(union);
    }
}
