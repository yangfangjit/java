package thread;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

	static CountDownLatch c = new CountDownLatch(2); 
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("count down once");
				c.countDown();
				System.out.println("count down twice");
				c.countDown();
			}
		}).start();

		try {
			c.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count = " + c.getCount());
	}

}
