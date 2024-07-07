import java.util.*;

public class ete10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int empid = sc.nextInt();
        double salary = sc.nextInt();
        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("invaild name");
        } else if (empid < 0) {
            System.out.println("invalid empi");
        } else if (salary < 0) {

            System.out.println("invalid salary");
        } else {
            System.out.println("data processed");
        }
    }
}
