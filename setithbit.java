import java.util.Scanner;

public class setithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int a = 1 << i;
        int ans = n | 1;
        System.out.println(ans);
    }
}
