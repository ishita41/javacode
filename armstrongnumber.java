import java.util.*;

public class armstrongnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        n = num;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += Math.pow(r, count);
            n /= 10;
        }
        if (sum == num)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
