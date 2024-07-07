import java.util.Scanner;

public class checknumberpowerof2ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Check if n is a power of 2
        // Using the condition (n & (n - 1)) == 0
        if ((n > 0) && ((n & (n - 1)) == 0)) {
            System.out.println("Yes, " + n + " is a power of 2");
        } else {
            System.out.println("No, " + n + " is not a power of 2");
        }
    }
}
