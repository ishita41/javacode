import java.util.Scanner;

public class codingmafia17 {
    public static void main(String[] args) {
        int x = 100;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        try {
            int ans = x / y;
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("hii isha");
        }
        System.out.println("hello");
    }
}
