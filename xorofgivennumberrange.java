import java.util.Scanner;

public class xorofgivennumberrange {

    public int findXOR(int l, int r) {
        return computeXOR(r) ^ computeXOR(l - 1);
    }

    private int computeXOR(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
        }
        return 0; // This line will never be reached
    }

    public static void main(String[] args) {
        xorofgivennumberrange solution = new xorofgivennumberrange();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of l: ");
        int l = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        sc.close();
        int result = solution.findXOR(l, r);
        System.out.println("The XOR of all integers in the range [" + l + ", " + r + "] is: " + result);
    }
}
