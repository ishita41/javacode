import java.util.Scanner;

public class ete60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of houses to visit (N): ");
        int N = sc.nextInt();

        System.out.print("Enter the value of M: ");
        int M = sc.nextInt();

        // Make sure to close the scanner to avoid resource leaks
        sc.close();

        int i = 0;
        int k = 0;

        while (i < N) {
            int houseNumber = 3 * k + 2;
            if (houseNumber % M != 0) {
                System.out.println(houseNumber);
                i++;
            }
            k++;
        }
    }
}
