import java.util.*;

public class codingmafia8 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l);
        System.out.println(l.getFirst());

        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            Integer data = it.next();
            System.out.println(data);
        }
    }
}
