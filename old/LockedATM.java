import java.util.*;
import java.util.concurrent.locks.*;

public class LockedATM {

	private Lock lock;
	private int balance = 100;

	public LockedATM() {
		lock = new ReentrantLock();
	}

	public int withdraw(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp - value;
			Thread.sleep(100);
			balance = temp;
		} catch (InterruptedException e) { }

		lock.unlock();
		return temp;
	}

	public int deposit(int value) {
		lock.lock();
		int temp = balance;
		try {
			Thread.sleep(100);
			temp = temp + value;
            System.out.println("Depositing...");
			Thread.sleep(300);
			balance = temp;
            System.out.println("New...");
		} catch (InterruptedException e) {}
			lock.unlock();
			return temp;
	}

    public static void main (String [] args) {
        LockedATM a = new LockedATM();
        a.withdraw(30);
        a.deposit(10);
    }
}
