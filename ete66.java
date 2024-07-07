import java.util.Scanner;

public class ete66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        n = num;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, count);
            n /= 10;
        }
        if (sum == num)
            System.out.println("lucky");
        else
            System.out.println("not");
    }
}
