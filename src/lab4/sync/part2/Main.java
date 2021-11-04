package lab4.sync.part2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IncUtil incUtil = new IncUtil();
        Thread thread1 = new FirstThread(1, incUtil);
        Thread thread2 = new Thread(new SecondThread(2, incUtil));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("a = " + incUtil.getA());
        System.out.println("b = " + incUtil.getB());
    }
}
