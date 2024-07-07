import java.util.Scanner;

public class ete112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        String name = sc.nextLine();
        int empid = sc.nextInt();
        double salary = sc.nextDouble();

        // Validate and process data
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Name");
        } else if (empid <= 0) {
            System.out.println("Invalid empid");
        } else if (salary < 0) {
            System.out.println("Invalid Salary");
        } else {
            System.out.println("Data processed");
        }

        sc.close();
    }
}
