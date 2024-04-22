package Ex6;

public class OptimizedPrimeFactorization implements Runnable {
    private int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Optimized: " + i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
