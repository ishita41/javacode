import java.util.Scanner;

public class ete663 {

    // Function to perform left rotation on a string
    static String leftRotate(String s, int n) {
        int m = s.length();
        if (n >= m) {
            return "-1"; // Invalid rotation count
        }
        n = n % m;
        char[] ch = s.toCharArray();
        reverse(ch, 0, n - 1);
        reverse(ch, n, m - 1);
        reverse(ch, 0, m - 1);
        return new String(ch);
    }

    // Function to perform right rotation on a string
    static String rightRotate(String s, int n) {
        int m = s.length();
        if (n >= m) {
            return "-1"; // Invalid rotation count
        }
        n = n % m;
        char[] ch = s.toCharArray();
        reverse(ch, 0, m - n - 1);
        reverse(ch, m - n, m - 1);
        reverse(ch, 0, m - 1);
        return new String(ch);
    }

    // Helper function to reverse a portion of the character array
    static void reverse(char[] ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the number of rotations:");
        int n = sc.nextInt();

        // Perform left rotation and print the result
        String leftRotated = leftRotate(s, n);
        System.out.println("Left rotated string: " + leftRotated);

        // Perform right rotation and print the result
        String rightRotated = rightRotate(s, n);
        System.out.println("Right rotated string: " + rightRotated);

        sc.close();
    }
}
