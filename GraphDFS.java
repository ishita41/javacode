/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphDFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
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

        boolean[] visited = new boolean[n + 1];
        dfs(ad, 1, visited);
    }

    public static void dfs(List<List<Integer>> ad, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i : ad.get(start)) {
            if (!visited[i]) {
                dfs(ad, i, visited);
            }
        }
    }
}*/
