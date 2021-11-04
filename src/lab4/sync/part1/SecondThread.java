package lab4.sync.part1;

public class SecondThread implements Runnable {
    private final int id;

    public SecondThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hello world from thread " + id);
        increment();
    }

    private void increment() {
        synchronized (Main.lock) {
            Main.a++;
        }
    }
}
