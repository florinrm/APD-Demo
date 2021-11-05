package lab4.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new FirstThread(1);
        Runnable runnable = new SecondThread(2);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
