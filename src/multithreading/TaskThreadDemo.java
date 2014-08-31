package multithreading;

public class TaskThreadDemo {

	public static void main(String[] args) {
		// Create tasks
		Runnable printA = new PrintChar('A', 100);
		Runnable printB = new PrintChar('B', 100);
		Runnable print100 = new PrintNum(100);

		// Create the threads
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);

		// Start the threads
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

// The task for printing a character a specified number of times
class PrintChar implements Runnable {
	private char charToPrint; // character to print
	private int times; // number of times to print the char

	// Constructor that takes a character and number of times
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	@Override
	/** Override the run method to tell the system what task to perform */
	public void run() {

		for (int i = 0; i < times; i++) {
			System.out.print(charToPrint);
		}

	}
}

// The task class for printing numbers from 1 to a given n
class PrintNum implements Runnable {
	int n; // the number to print to

	// constructor that takes a number to print to
	public PrintNum(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}
	}
}