import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class codingmafia12 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("ishita");
        al.add("isha");
        al.add("sanjeev");
        al.add("ashu");
        al.add("goldy");
        al.add("ritu");
        System.out.println("before sorting");
        for (String i : al) {
            System.out.println(i);
        }
        // Sort the ArrayList
        Collections.sort(al);
        System.out.println("after sorting");
        // Print the sorted ArrayList
        for (String i : al) {
            System.out.println(i);
        }
        int arr[] = { 1, 0, 8, 90, 788 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
