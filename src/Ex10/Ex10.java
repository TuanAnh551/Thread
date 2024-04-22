package Ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giây mà bạn muốn thread ngủ:");
        long sleepTime = scanner.nextLong();
        SleepThread sleepThread = new SleepThread(sleepTime);
        sleepThread.start();
    }
}