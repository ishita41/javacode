import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        String res = "";

        if (n == 0) {
            res = "0";
        }

        while (n != 0) {
            if (n % 2 == 1) {
                res = "1" + res;
            } else {
                res = "0" + res;
            }
            n /= 2;
        }

        System.out.println("Binary representation: " + res);
    }
}
