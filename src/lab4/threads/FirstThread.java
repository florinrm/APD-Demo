package lab4.threads;

public class FirstThread extends Thread {
    private final int id;

    public FirstThread(int id) {
        super();
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Hello world from thread " + id);
        System.out.println(Thread.currentThread().getName());
    }
}
