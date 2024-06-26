public class codingmafia19 extends Thread {
    private String threadName;
    private int counter;
    private int waitTillWhileLoop;

    public codingmafia19(String threadName, int counter, int waitTillWhileLoop) {
        this.threadName = threadName;
        this.counter = counter;
        this.waitTillWhileLoop = waitTillWhileLoop;
    }

    public void run() {
        while (counter < 1000) {
            counter++;

            try {
                Thread.sleep(waitTillWhileLoop);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadName + " " + counter);
        }
    }

    public static void main(String[] args) {
        codingmafia19 threadA = new codingmafia19("thread_a", 0, 5000);
        codingmafia19 threadB = new codingmafia19("thread_b", 0, 1000);

        System.out.println("Initial counter values:");
        System.out.println(threadA.threadName + " counter: " + threadA.counter);
        System.out.println(threadB.threadName + " counter: " + threadB.counter);

        threadA.start();
        threadB.start();

        System.out.println("Final counter values:");
        System.out.println(threadA.threadName + " counter: " + threadA.counter);
        System.out.println(threadB.threadName + " counter: " + threadB.counter);
    }
}
