import java.util.Scanner;

class RemoveSpacesAndCapitalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Split the input string by spaces and remove all spaces
        String[] words = input.split("\\s+");

        // StringBuilder to build the output
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            // Capitalize the first letter of each word
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1));
                }
            }
        }

        // Print the updated string
        System.out.println(sb.toString());

        scanner.close();
    }
}
