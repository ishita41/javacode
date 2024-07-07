import java.util.Scanner;
import java.util.Stack;

public class ete42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        if (balanced && st.isEmpty()) {
            System.out.println("balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
}
