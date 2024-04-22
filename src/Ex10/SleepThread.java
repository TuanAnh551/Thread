package Ex10;

public class SleepThread extends Thread {
    private long sleepTime;

    public SleepThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread sẽ ngủ " + sleepTime + " giây.");
            Thread.sleep(sleepTime * 1000);
            System.out.println("Thread dậy sau " + sleepTime + " giây.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
