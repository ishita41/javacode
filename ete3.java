import java.util.Scanner;

public class ete3 {
    public static void main(String[] args) {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        String longesString = "";
        int maxLength = 0;
        for (String i : words) {
            if (i.length() > maxLength) {
                maxLength = i.length();
                longesString = i;
            }
        }
        System.out.println(maxLength);
    }
}
