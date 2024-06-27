import java.util.Scanner;

public class stringpalindrome {
    public static Boolean palindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2)
            return true;
        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        return palindrome(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (palindrome(s, 0))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
