import java.util.*;

public class ete334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sizes of the three linked lists
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        // Read elements of the first linked list
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(scanner.nextInt());
        }

        // Read elements of the second linked list
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(scanner.nextInt());
        }

        // Read elements of the third linked list
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list3.add(scanner.nextInt());
        }

        // Read the target sum
        int target = scanner.nextInt();

        // Find and print the first combination that sums to the target
        boolean found = false;
        for (int a : list1) {
            for (int b : list2) {
                for (int c : list3) {
                    if (a + b + c == target) {
                        System.out.println(a + " " + b + " " + c);
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }
            if (found)
                break;
        }

        if (!found) {
            System.out.println("No combination found");
        }

        scanner.close();
    }
}
