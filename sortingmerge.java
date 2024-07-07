import java.util.ArrayList;
import java.util.Scanner;

public class sortingmerge {

    static void mergeSort(int a[], int s, int e, int mid) {
        ArrayList<Integer> al = new ArrayList<>();
        int l = s;
        int r = mid + 1;

        while (l <= mid && r <= e) {
            if (a[l] <= a[r]) {
                al.add(a[l]);
                l++;
            } else {
                al.add(a[r]);
                r--;
            }
        }

        while (l <= mid) {
            al.add(a[l]);
            l++;
        }

        while (r <= e) {
            al.add(a[r]);
            r++;
        }

        for (int i = s; i <= e; i++) {
            a[i] = al.get(i - s);
        }
    }

    static void merge(int a[], int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = (l + h) / 2;
        merge(a, l, mid); // left half
        merge(a, mid + 1, h); // right half
        mergeSort(a, l, h, mid); // merging sorted halves
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Before Sorting Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        merge(a, 0, a.length - 1);

        System.out.println("After Sorting Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
