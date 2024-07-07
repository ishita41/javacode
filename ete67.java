import java.util.Scanner;

public class ete67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String inputText = scanner.nextLine();

        System.out.print("Enter the indices (space-separated): ");
        String indicesInput = scanner.nextLine();

        String[] indicesStr = indicesInput.split(" ");
        int[] inputIndices = new int[indicesStr.length];

        for (int i = 0; i < indicesStr.length; i++) {
            inputIndices[i] = Integer.parseInt(indicesStr[i]);
        }

        StringBuilder sb = new StringBuilder(inputText);
        for (int i = 0; i < inputIndices.length; i++) {
            int index = inputIndices[i];
            sb.insert(index, '*');
        }

        String modifiedText = sb.toString();
        System.out.println("Modified string: " + modifiedText);

        scanner.close();
    }
}
