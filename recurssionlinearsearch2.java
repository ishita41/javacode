import java.util.*;

class RecursionLinearSearch2 {
    static ArrayList<Integer> linear(int a[], int n, int i, int t) {
        ArrayList<Integer> al = new ArrayList<>();
        if (i == n) {
            return al;
        }
        if (a[i] == t) {
            al.add(i);
        }
        al.addAll(linear(a, n, i + 1, t));
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        ArrayList<Integer> ans = linear(a, n, 0, t);
        for (int i : ans) {
            System.out.println(i);
        }

    }
}
