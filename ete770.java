import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ete770 {

    // Function to generate all subsequences of a string
    static List<String> generateSubsequences(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequencesHelper(s, 0, new StringBuilder(), result);
        return result;
    }

    // Helper function to recursively generate subsequences
    static void generateSubsequencesHelper(String s, int idx, StringBuilder current, List<String> result) {
        // Base case: when index reaches end of string
        if (idx == s.length()) {
            if (current.length() > 0) {
                result.add(current.toString()); // Add current subsequence to result
            }
            return;
        }

        // Case 1: Include character at current index
        current.append(s.charAt(idx));
        generateSubsequencesHelper(s, idx + 1, current, result);

        // Case 2: Exclude character at current index (backtracking)
        current.deleteCharAt(current.length() - 1);
        generateSubsequencesHelper(s, idx + 1, current, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Generate subsequences
        List<String> subsequences = generateSubsequences(s);

        // Print the subsequences
        System.out.println("Subsequences:");
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }

        sc.close();
    }
}
