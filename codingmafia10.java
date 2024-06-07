import java.util.*;

public class codingmafia10 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push("ishita");
        st.push("mahajan");
        st.push("21");
        st2.push(1);
        st2.push(2);
        st2.push(3);
        System.out.println(st.pop());
        System.out.println(st.empty());
        while (!st.empty()) {
            String ans = st.pop();

            System.out.println(ans);

        }
        Iterator<Integer> it = st2.iterator();
        while (it.hasNext()) {
            System.out.println("showing" + it.next());
        }

        System.out.println("///");
        System.out.println(st2.search(1) + "/");
        System.out.println(st2.peek());
        while (!st2.empty()) {

            int res = st2.pop();

            System.out.println(res);
        }

    }
}
