import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codinhgmafia21 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        es.submit(new codingmafia120(threadA, 0, 100));
        // es.submit(codingmafia120(thread_b, 0, 100));
    }
}
