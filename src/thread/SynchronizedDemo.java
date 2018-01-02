package thread;

public class SynchronizedDemo {
	private boolean ready = false;
	private int result = 0;
	private int number = 1;
	
	public void write() {
		ready = true;
		number = 2;
	}
	
	public void read() {
		if (ready) {
			result = number * 3;
		}
		System.out.println("result的值为: " + result);
	}
	
	public class ReadWriteThread extends Thread {
		private boolean flag;
		
		public ReadWriteThread(boolean flag) {
			this.flag = flag;
		}
		
		@Override
		public void run() {
			if (flag) {
				write();
			} else {
				read();
			}
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
		synchronizedDemo.new ReadWriteThread(true).start();
		synchronizedDemo.new ReadWriteThread(false).start();
	}

}
