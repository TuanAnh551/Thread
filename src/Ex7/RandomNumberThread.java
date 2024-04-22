package Ex7;

public class RandomNumberThread extends Thread {
    @Override
    public void run() {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
    }
}
