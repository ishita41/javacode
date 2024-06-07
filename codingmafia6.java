import java.util.*;

public class codingmafia6 {
    public static void main(String[] args) {
        Random r = new Random();
        // Generating a random number between 100 and 899 (inclusive)
        int randomNumber = r.nextInt(800) + 100;
        System.out.println(randomNumber);

        String i = "ishita";
        System.out.println(i);

        String j = i + "mahajan";
        System.out.println(j);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int t = sc.nextInt();
        System.out.println(t);

        String str = "helloworld";
        System.out.println(str);
        String string = str + "!";
        System.out.println(string);
        System.out.println(string.length());
        System.out.println(string.substring(0, 4));
        System.out.println(string.substring(5));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.indexOf('l'));
        System.out.println(string.charAt(4));
        String s1 = "abc";
        String s2 = "ish";
        System.out.println(s1.compareTo(s2));

        // Corrected date and time operations
        long currentEpochTime = System.currentTimeMillis();
        for (int ii = 0; ii < 100000; ii++) {
            // Intentional empty loop to consume time
        }
        long timeNow = System.currentTimeMillis();
        System.out.println(timeNow - currentEpochTime);

        sc.close(); // Closing the scanner
    }
}
