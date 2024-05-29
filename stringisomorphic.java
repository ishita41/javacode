import java.util.HashMap;
import java.util.Scanner;

public class stringisomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        if (s.length() != t.length()) {
            System.out.println("no");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + i);
        }
        for (int i = 0; i < t.length(); i++) {
            mp2.put(t.charAt(i), mp2.getOrDefault(t.charAt(i), 0) + i);
        }

        boolean isIsomorphic = true;
        for (int i = 0; i < s.length(); i++) {
            if (!mp1.get(s.charAt(i)).equals(mp2.get(t.charAt(i)))) {
                isIsomorphic = false;
                break;
            }
        }

        System.out.println(isIsomorphic ? "yes" : "no");
    }
}
