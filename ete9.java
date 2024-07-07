import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ete9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the larger string
        String text = scanner.nextLine();

        // Read the target substring
        String target = scanner.nextLine();

        // Find all occurrences of the target substring
        List<Integer> positions = findOccurrences(text, target);

        // Print the results
        if (positions.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(positions);
        }

        scanner.close();
    }

    // Iterative function to find all occurrences of the target substring
    private static List<Integer> findOccurrences(String text, String target) {
        List<Integer> positions = new ArrayList<>();
        int index = text.indexOf(target);

        // Loop through the text and find all occurrences of the target substring
        while (index != -1) {
            positions.add(index);
            // Start the next search from the character after the current match
            index = text.indexOf(target, index + 1);
        }

        return positions;
    }
}
