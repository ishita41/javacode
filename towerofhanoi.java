import java.util.Scanner;

public class towerofhanoi {
    public static void toh(int n, int source, int help, int dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + dest);
            return;
        }
        toh(n - 1, source, dest, help);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + dest);
        toh(n - 1, help, source, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        sc.close();

        toh(n, 1, 2, 3);
    }
}
