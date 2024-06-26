import java.util.Scanner;

public class recurssion4 {
    public static int print(int n, int sum) {
        if (n == 0)
            return sum;
        sum += n * n * n;
        return print(n - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println(print(n, sum));
    }
}
