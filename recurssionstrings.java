import java.util.*;

class recursionstrings {
    public static String helper(String s, int i, StringBuilder a) {
        if (i == s.length())
            return a.toString();
        if (s.charAt(i) != 'a')
            a.append(s.charAt(i));
        return helper(s, i + 1, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder();
        System.out.println(helper(s, 0, a));
    }
}
