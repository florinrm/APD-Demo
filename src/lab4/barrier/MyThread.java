package lab4.barrier;

import java.util.concurrent.BrokenBarrierException;

public class MyThread extends Thread {
    private final int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Before barrier in thread " + id);

        try {
            Main.barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("After barrier in thread " + id);
    }
}
