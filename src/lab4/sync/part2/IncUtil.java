package lab4.sync.part2;

public class IncUtil {
    private int a = 0;
    private int b = 0;

    public synchronized void incrementA() {
        a++;
    }

    /*
    // o alta forma de a rescrie incrementA()
    public void incrementA() {
        synchronized(this) {
            a++;
        }
    }
     */

    // acelasi lucru ca mai sus
    public void incrementB() {
        synchronized (this) {
            b++;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
