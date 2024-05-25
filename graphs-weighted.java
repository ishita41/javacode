public class graphs-weighted {
    public static void weighted(){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();  // Number of vertices
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();  // Number of edges

        List<List<Integer>> ad = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ad.add(new ArrayList<>());
        }

}
