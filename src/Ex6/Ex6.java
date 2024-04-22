package Ex6;

public class Ex6 {
    public static void main(String[] args) {

        LazyPrimeFactorization lazyPrime = new LazyPrimeFactorization(20);
        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization(20);

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        thread2.start();
    }
}
