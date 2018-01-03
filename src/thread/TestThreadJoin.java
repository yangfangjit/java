package thread;

public class TestThreadJoin {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 100; j++) {
						System.out.println("j = " + j);
					}
				}
			});
			
			thread.start();
			try {
				System.out.println("Thread " + thread.getId() + " executes join ......");
				thread.join();
				System.out.println("Thread " + thread.getId() + " end to execute join.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("duration is " + (System.currentTimeMillis() - start));
	}

}
