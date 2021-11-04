package lab4.sync.part2;

public class FirstThread extends Thread {
    private final int id;
    private final IncUtil inc;

    public FirstThread(int id, IncUtil inc) {
        super();
        this.id = id;
        this.inc = inc;
    }

    @Override
    public void run() {
        System.out.println("Hello world from thread " + id);
        inc.incrementA();
        inc.incrementB();
    }
}
