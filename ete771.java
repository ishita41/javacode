import java.util.Scanner;

public class ete771 {

    // Function to find the largest number <= N which is non-decreasing
    public static int largest(int n) {
        while (n > 0) {
            if (nondec(n)) {
                return n;
            }
            n--;
        }
        return 0; // If no valid number found (though it should not happen as per problem
                  // statement)
    }

    // Function to check if a number is non-decreasing
    public static boolean nondec(int n) {
        String s = String.valueOf(n);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Input number for each test case

            // Find the largest number <= N which is non-decreasing
            int res = largest(n);

            // Output the result for the current test case
            System.out.println(res);
        }

        sc.close();
    }
}
