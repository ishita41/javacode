import java.util.*;

public class codingmafia {
    public static void main(String[] args) {
        int a = 400;
        int b = 8;
        int c = a + b;
        System.out.println("sum" + c);

        // widening
        double dv = a + 0.1; // 8 bytes
        System.out.println("widening variable " + dv);

        // narrowing
        int nv = (int) dv;
        System.out.println("Norrowing " + nv);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int min = Integer.MIN_VALUE;
        System.out.println(min);

        // overflow
        System.out.println(max + 4);

    }
}
