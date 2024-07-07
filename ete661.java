import java.util.Scanner;

public class ete661 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume newline character after reading T

        StringBuilder output = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            int shortestLength = findShortestLength(s);
            output.append(shortestLength).append("\n");
        }

        System.out.print(output);
        sc.close();
    }

    private static int findShortestLength(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n - 1;) {
            if ((s.charAt(i) == '1' && s.charAt(i + 1) == '0') || (s.charAt(i) == '0' && s.charAt(i + 1) == '0')) {
                count++;
                i += 2; // Skip the deleted substring
            } else {
                i++; // Move to the next character
            }
        }

        // Calculate the shortest length possible
        return n - 2 * count;
    }
}
