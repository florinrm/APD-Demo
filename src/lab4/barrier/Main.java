package lab4.barrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static final int NO_THREADS = 8;
    public static CyclicBarrier barrier = new CyclicBarrier(NO_THREADS);

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[NO_THREADS];

        for (int i = 0; i < NO_THREADS; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }

        for (int i = 0; i < NO_THREADS; i++) {
            threads[i].join();
        }
    }
}
