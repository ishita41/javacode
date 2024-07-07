import java.util.Scanner;

public class stringsskipa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                continue;
            else
                a.append(s.charAt(i));
        }
        System.out.println(a.toString());
    }
}
