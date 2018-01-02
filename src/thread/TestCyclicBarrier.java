package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

	static CyclicBarrier cb = new CyclicBarrier(2);
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				for (; i < 100; i++) {
					System.out.println("i = " + i);
				}
				System.out.println("cb.await() once");
				try {
					cb.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
				
				for (; i < 200; i++) {
					System.out.println("i = " + i);
				}
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				for (; i < 100; i++) {
					System.out.println("i = " + i);
				}
				System.out.println("cb.await() once");
				try {
					cb.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
				
				for (; i < 200; i++) {
					System.out.println("i = " + i);
				}
				
			}
		}).start();

		System.out.println("end .");
	}

}
