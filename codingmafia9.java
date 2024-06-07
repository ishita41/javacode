import java.util.HashMap;
import java.util.Map;

public class codingmafia9 {
    public static void main(String[] args) {
        HashMap<String, String> mp = new HashMap<>();
        mp.put("ishita", "mahajan");
        mp.put("ritu", "mahajan");
        mp.put("sanjeev", "mahajan");
        System.out.println(mp.get("ishita"));
        System.out.println(mp.values());
        System.out.println(mp.keySet());
        System.out.println(mp.containsKey("ishita"));
        for (String s : mp.keySet()) {
            System.out.print(s + " ");
            System.out.println();
            System.out.println(mp.values());
        }
        for (Map.Entry<String, String> x : mp.entrySet()) {
            System.out.println(x.getKey() + ":" + x.getValue());
        }
    }
}
