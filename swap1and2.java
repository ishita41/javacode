public class swap1and2 {

    public static int swapFirstTwoDigits(int number) {
        String numberStr = Integer.toString(Math.abs(number));

        if (numberStr.length() < 2) {
            throw new IllegalArgumentException("Number must have at least two digits");
        }

        // Swap the first two characters
        char[] charArray = numberStr.toCharArray();
        char temp = charArray[0];
        charArray[0] = charArray[1];
        charArray[1] = temp;

        // Convert back to integer
        int swappedNumber = Integer.parseInt(new String(charArray));

        // If the original number was negative, make the result negative
        return number < 0 ? -swappedNumber : swappedNumber;
    }

    public static void main(String[] args) {
        int num1 = 12345;
        int num2 = -987;
        int num3 = 45;

        System.out.println("Original: " + num1 + " -> Swapped: " + swapFirstTwoDigits(num1));
        System.out.println("Original: " + num2 + " -> Swapped: " + swapFirstTwoDigits(num2));
        System.out.println("Original: " + num3 + " -> Swapped: " + swapFirstTwoDigits(num3));
    }
}
