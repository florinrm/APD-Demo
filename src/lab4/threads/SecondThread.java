package lab4.threads;

public class SecondThread implements Runnable {
    private final int id;

    public SecondThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hello world from thread " + id);
        System.out.println(Thread.currentThread().getName());
    }
}
