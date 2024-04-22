package Ex8;
public class Ex8 {
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        Thread incrementThread = new Thread(new IncrementThread(counter));
        Thread decrementThread = new Thread(new DecrementThread(counter));

        incrementThread.start();
        decrementThread.start();
    }
}
