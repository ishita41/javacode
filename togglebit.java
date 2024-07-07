import java.util.Scanner;

public class togglebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the bit position to toggle (zero-based): ");
        int i = sc.nextInt();
        sc.close();

        // Create a bitmask by shifting 1 left by 'i' positions
        int bitmask = 1 << i;
        // Use bitwise XOR to toggle the i-th bit
        int result = n ^ bitmask;

        System.out.println("The new number with the " + i + "-th bit toggled is: " + result);
    }
}
