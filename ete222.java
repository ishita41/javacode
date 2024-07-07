public class ete222 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input product type
        String productType = scanner.nextLine();
        scanner.close();

        // Generate the tag
        String tag = generateTag(productType);

        // Print the tag
        System.out.println(tag);
    }

    private static String generateTag(String productType) {
        StringBuilder tagBuilder = new StringBuilder();
        int length = productType.length();

        for (int i = 0; i < length; i += 2) {
            if (i + 1 < length) {
                // Form a pair and remove the lexicographically smallest character
                char firstChar = productType.charAt(i);
                char secondChar = productType.charAt(i + 1);
                if (firstChar < secondChar) {
                    tagBuilder.append(secondChar);
                } else {
                    tagBuilder.append(firstChar);
                }
            } else {
                // Unpaired character
                tagBuilder.append(productType.charAt(i));
            }
        }

        return tagBuilder.toString();
    }
}
