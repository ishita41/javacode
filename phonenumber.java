import java.util.*;

class phonenumber {
    public static void solve(String digit, String output, int idx, List<String> ans, String[] map) {
        if (idx >= digit.length()) {
            ans.add(output);
            return;
        }
        int num = digit.charAt(idx) - '0';
        String value = map[num];
        for (int i = 0; i < value.length(); i++) {
            output += value.charAt(i);
            solve(digit, output, idx + 1, ans, map);
            output = output.substring(0, output.length() - 1);
        }
    }

    public static ArrayList<String> combinationss(String digit) {
        ArrayList<String> ans = new ArrayList<>();
        if (digit.length() == 0) {
            return ans;
        }
        String output = "";
        int idx = 0;
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        solve(digit, output, idx, ans, map);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit = sc.nextLine();
        System.out.println(combinationss(digit));
    }
}