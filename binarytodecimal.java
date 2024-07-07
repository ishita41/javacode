import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int b = sc.nextInt();
        int d = 0;
        int p = 1;

        while (b != 0) {
            int ld = b % 10;
            d += ld * p;
            p *= 2;
            b /= 10;
        }

        System.out.println("Decimal representation: " + d);
    }
}
