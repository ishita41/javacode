import java.util.Scanner;

public class checkithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int a = n >> i;
        if ((a & 1) == 1)
            System.out.println("set");
        else
            System.out.println("not set");
    }
}
