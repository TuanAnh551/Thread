package Ex11;

public class Ex11 {
    public static void main(String[] args) {
        PrimeNumberThread primeNumberThread = new PrimeNumberThread();
        System.out.println("Số nguyên tố từ 1 đến 10000:");
        primeNumberThread.start();
    }
}
