import java.util.Scanner;

public class stringtoggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ans += (char) (c - 'a' + 'A');
            } else if (c >= 'A' && c <= 'Z') {
                ans += (char) (c - 'A' + 'a');
            } else {
                ans += c; // non-alphabetic characters remain unchanged
            }
        }

        System.out.println(ans);
    }
}
