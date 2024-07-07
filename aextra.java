import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class aextra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean balanced = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    balanced = false;
                    break;
                }
                if ((s.charAt(i) == ']' && st.peek() == '[') || (s.charAt(i) == '}' && st.peek() == '}')
                        || (s.charAt(i) == ')' && st.peek() == '(')) {
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