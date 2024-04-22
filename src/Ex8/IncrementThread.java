package Ex8;

public class IncrementThread implements Runnable {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}