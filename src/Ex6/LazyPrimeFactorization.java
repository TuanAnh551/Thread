package Ex6;

public class LazyPrimeFactorization implements Runnable {
    private int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy: " + i);
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}