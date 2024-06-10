public class codingmafia14 extends codingmafia13 {
    /*
     * public codingmafia14() {
     * super();
     * }
     */

    public codingmafia14(String numberplate) {
        super(numberplate);
    }

    /*
     * public codingmafia14(String numberplate, int currentspeed) {
     * // super(numberplate, currentspeed);
     * }
     */

    public static void main(String[] args) {
        codingmafia14 tesla = new codingmafia14("1001");
        tesla.accelerate();
        System.out.println(tesla.currentspeed);
    }
}
