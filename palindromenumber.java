import java.util.Scanner;

public class palindromenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        int num = n;
        int rev = 0;
        while (n > 0) {
            int x = n % 10;
            rev = rev * 10 + x;
            n /= 10;
        }

        return rev == num;
    }
}
