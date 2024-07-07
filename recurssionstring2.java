import java.util.Scanner;

public class recurssionstring2 {
    public static String helper(String s, String w, int i) {
        StringBuilder sb = new StringBuilder();
        if (i >= s.length())
            return "";
        if (s.startsWith(w, i)) {
            return helper(s, w, i + w.length());
        } else {
            return s.charAt(i) + helper(s, w, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w = sc.nextLine();
        System.out.println(helper(s, w, 0));
    }
}
