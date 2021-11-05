package lab4.sync.part3;

public class IncUtil {
    private static int a = 0;
    private static int b = 0;

    public static synchronized void incrementA() {
        a++;
    }

    /*
    public static void incrementA() {
        synchronized (IncUtil.class) {
            a++;
        }
    }
     */

    // acelasi lucru ca mai sus
    public static void incrementB() {
        synchronized (IncUtil.class) {
            b++;
        }
    }

    /*
    public static void incrementB() {
        synchronized (Main.lock) {
            b++;
        }
    }
    */

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }
}
