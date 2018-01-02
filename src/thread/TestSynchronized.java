package thread;

public class TestSynchronized {
	
	static final int COUNT = 1000;
	/**
	 * synchronized static method, almost same to synchronized(this.getClass())
	 */
	static synchronized void staticSyn() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("staticSyn " + i);
		}
	}
	
	/**
	 * synchronized instance method, roughly equivalent to synchronized(this)
	 */
	synchronized void instanceSyn() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("instanceSyn " + i);
		}
	}
	
	/**
	 * synchronized  
	 */
	void blockInstance() {
		synchronized (this) {
			for (int i = 0; i < COUNT; i++) {
				System.out.println("blockInstance " + i);
			}
		}
	}
	
	void blockClass() {
		synchronized (this.getClass()) {
			for (int i = 0; i < COUNT; i++) {
				System.out.println("blockClass " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				TestSynchronized.staticSyn();
			}
		}).start();

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				new TestSynchronized().blockClass();
			}
		}).start();
		
	}

}
