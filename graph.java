import java.util.*;

public class graph {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int e = sc.nextInt();
    /*
     * List<List<Integer>> ad=new ArrayList<>();
     * for(int i=1;i<=n;i++){
     * ad.add(new ArrayList<>())
     * }
     * for(int i=1;i<=e;i++){
     * int a=sc.nectInt();
     * int b=sc.nextInt();
     * ad.get(a).add(b);
     * ad.get(b).add(a);
     * }
     */
    int [][] mat= new int[n][n];for(
    int i = 1;i<=e;i++)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        mat[a][b] = 1;
        mat[b][a] = 1;
    }for(
    int i = 0;i<n;i++)
    {
        for (int j = 0; j < n; j++) {
            System.out.println(mat[i][j] + " ");
        }
        System.out.println();
    }
}
