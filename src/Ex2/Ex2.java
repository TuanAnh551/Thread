package Ex2;

public class Ex2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tổng các số từ 1-1000 là: " + sumThread.getSum());
    }
}