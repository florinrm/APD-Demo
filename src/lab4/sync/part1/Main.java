package lab4.sync.part1;

public class Main {
    public static int a = 2;
    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new FirstThread(1);
        Thread thread2 = new Thread(new SecondThread(2));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("a = " + a);
    }
}
