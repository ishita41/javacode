import java.util.Scanner;

public class codingmafia18 {
    public static void main(String[] args) {
        int x = 100;
        Scanner sc = new Scanner(System.in);
        // int y=sc.nextInt()
        try {
            int arr[] = { 1, 2, 4 };
            System.out.println(arr[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        } finally {
            System.out.println("finally");
        }
        System.out.println("hello");
        int i = 100;
        i++;

        if (i > 100) {
            throw new RuntimeException("i m exception");
        }

    }
}
