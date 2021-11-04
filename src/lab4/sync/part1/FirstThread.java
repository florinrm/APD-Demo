package lab4.sync.part1;

public class FirstThread extends Thread {
    private final int id;

    public FirstThread(int id) {
        super();
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
