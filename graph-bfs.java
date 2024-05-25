import java.util.*;

public class GraphBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt(); // Number of vertices
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt(); // Number of edges

        List<List<Integer>> ad = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ad.add(new ArrayList<>());
        }

        System.out.println("Enter the edges (format: source destination):");
        for (int i = 1; i <= e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ad.get(a).add(b);
            ad.get(b).add(a);
        }

        System.out.print("Enter the starting vertex for BFS: ");
        int startVertex = sc.nextInt();

        bfs(ad, startVertex);
    }

    public static void bfs(List<List<Integer>> ad, int start) {
        boolean[] visited = new boolean[ad.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : ad.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
