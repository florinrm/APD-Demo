package lab4.sync.part2;

public class SecondThread implements Runnable {
    private final int id;
    private final IncUtil inc;

    public SecondThread(int id, IncUtil inc) {
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
