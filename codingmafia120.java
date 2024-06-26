public class codingmafia120 implements Runnable {
    private String threadName;
    private int counter;
    private int waitTillWhileLoop;

    // Constructor to initialize threadName, counter, and waitTillWhileLoop
    public codingmafia120(String threadName, int counter, int waitTillWhileLoop) {
        this.threadName = threadName;
        this.counter = counter;
        this.waitTillWhileLoop = waitTillWhileLoop;
    }

    public void run() {
        // Define what our program wants to do
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
        // Create instances of the Runnable
        codingmafia120 threadA = new codingmafia120("thread_a", 0, 5000);
        codingmafia120 threadB = new codingmafia120("thread_b", 0, 1000);

        System.out.println("Initial counter values:");
        System.out.println(threadA.threadName + " counter: " + threadA.counter);
        System.out.println(threadB.threadName + " counter: " + threadB.counter);

        // Create Thread objects and start them
        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter values
        System.out.println("Final counter values:");
        System.out.println(threadA.threadName + " counter: " + threadA.counter);
        System.out.println(threadB.threadName + " counter: " + threadB.counter);
    }
}
