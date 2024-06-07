import java.util.ArrayList;

public class codingmafia7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ishita");
        al.add("mahajan");

        System.out.println(al.get(0)); // Output: ishita

        al.add(0, "I");
        System.out.println(al); // Output: [ishita, mahajan, o]
        System.out.println(al.size());
        al.remove(0);
        System.out.println(al);
        al.clear();
        System.out.println(al);
    }
}
