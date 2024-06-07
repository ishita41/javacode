import java.util.*;

public class codingmafia11 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(8);
        set.add(7);
        set.add(9);
        set.add(8);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (int x : set) {
            System.out.println(x);
        }
        System.out.println(set.size());
        System.out.println(set.remove(9));
        // remove all elements from the set
        set.clear();
        System.out.println(set.contains(9));
    }
}
