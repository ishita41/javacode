import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
