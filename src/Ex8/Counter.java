package Ex8;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public synchronized void increment() {
        value++;
        System.out.println("Tăng giá trị: " + value);
    }

    public synchronized void decrement() {
        value--;
        System.out.println("Giảm giá trị: " + value);
    }

    public int getValue() {
        return value;
    }
}