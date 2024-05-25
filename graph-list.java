import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of vertices
        int e = sc.nextInt(); // Number of edges

        List<List<Integer>> ad = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ad.add(new ArrayList<>());
        }

        for (int i = 1; i <= e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ad.get(a).add(b);
            ad.get(b).add(a);
        }

        // Print the adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j : ad.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
