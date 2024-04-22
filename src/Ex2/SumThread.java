package Ex2;

public class SumThread extends Thread {
    private long sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
