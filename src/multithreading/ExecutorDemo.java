package multithreading;

import java.util.concurrent.*;

public class ExecutorDemo{
	public static void main(String[] args){
		
		// Create a thread pool with the executor service
		ExecutorService executor = Executors.newCachedThreadPool();
		
		// Add tasks to the thread pool
		executor.execute(new PrintChar('a', 299));
		executor.execute(new PrintChar('y', 299));
		
		//shutdown the executor
		executor.shutdown();
	}
}