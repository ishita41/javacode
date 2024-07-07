import java.util.Scanner;

public class ete667 {
    // Method to check if a binary string is a palindrome
    public static boolean palindrome(String a) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Read the input as an integer
        sc.close();

        int count = 0;
        int num = 0;
        while (count < a) {
            num++;
            String b = Integer.toBinaryString(num);
            if (palindrome(b)) {
                count++;
            }
        }
        System.out.println(num); // Print the Ath palindromic binary number
    }
}
