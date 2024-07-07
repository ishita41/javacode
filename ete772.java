import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ete772 {
    static List<Integer> find(String text, String target) {
        List<Integer> al = new ArrayList<>();
        int idx = text.indexOf(target);
        while (idx != -1) {
            al.add(idx);
            idx = text.indexOf(target, idx + 1);
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String target = sc.nextLine();
        List<Integer> ans = find(text, target);
        if (ans.isEmpty())
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
