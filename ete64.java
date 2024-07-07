import java.util.Scanner;

public class ete64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int totalSetBits = 0;

        for (int i = 1; i <= A; i++) {
            int num = i;
            while (num > 0) {
                totalSetBits += num & 1;
                num >>= 1;
            }
        }

        System.out.println(totalSetBits);
    }
}
