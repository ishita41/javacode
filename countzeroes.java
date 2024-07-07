import java.util.Scanner;

public class countzeroes {
    static int countno(int n, int count) {
        if (n == 0)
            return count;
        int rem = n % 10;
        if (rem == 0)
            return countno(n / 10, count + 1);
        else
            return countno(n / 10, count); // Continue recursion if rem is not zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countno(n, 0));
    }
}
