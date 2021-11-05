package lab4.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new FirstThread(1);
        Thread thread2 = new Thread(new SecondThread(2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
