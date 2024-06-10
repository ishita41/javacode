/*public class codingmafia13 {
    final int maxspeed = 100;
    int currentspeed = 10;
    public static int wheelCount = 4;
    String numberplate;

    void accelerate() {
        System.out.println("audi" + numberplate);
        System.out.println("audi" + numberplate);
        currentspeed++;
    }

    public codingmafia13(String numberplate) {
        this.numberplate = numberplate;
        // the value of this current object refrence
    }

    public static void main(String[] args) {
        codingmafia13 audi = new codingmafia13("audi123");
        System.out.println(audi.currentspeed);
        audi.accelerate();
        audi.accelerate();
        audi.accelerate();
        System.out.println(audi.currentspeed);
        codingmafia13 bmw = new codingmafia13("bmw123");
        System.out.println(bmw.currentspeed);
        audi.wheelCount++;
        System.out.println(audi.wheelCount);
        System.out.println(bmw.wheelCount);
    }
}
