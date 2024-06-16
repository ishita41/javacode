public class codingmafia19 extends Thread {
    private String threadName;
    public int counter;

    public codingmafia19(String threadName, int counter) {
        this.threadName = threadName;
        this.counter = counter;
    }

    public void run() {
        // define what our program wants to do
        while (counter < 1000) {
            counter++;
        }
    }

    public static void main(String[] args) {
        codingmafia19 ob = new codingmafia19("thread_a", 0);
        codingmafia19 ob2 = new codingmafia19("thread_b", 500);
        System.out.println(ob.counter);
        System.out.println(ob2.counter);
        ob.run();
        System.out.println(ob.counter);
        ob2.run();
        System.out.println(ob2.counter);
    }
}
