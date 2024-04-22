package Ex3;

public class Ex3 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        System.out.println("Số chẵn:" );
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Số lẻ:");
        oddThread.start();
    }
}