package W10;

public class DeadlockDemo extends Thread {

	final String res1 = "Resource 1";
	final String res2 = "Resource 2";
	
	//	t1 tries to lock resource 1 then resource 1
	Thread t1 = new Thread() {
		
		@Override
		public void run() {
			
			synchronized(res1) {
				System.out.println("Thread 1: Locked resource 1");
				try {
					Thread.sleep(100);
				} catch(Exception e) {
					System.out.println(e);
				}
				
				synchronized(res2) {
					System.out.println("Thread 2: Locked resource2");
				}
			}
			
		}	
	};
	
	Thread t2 = new Thread() {
		
		@Override
		public void run() {
				
			synchronized(res2) {
				System.out.println("Thread 1: Locked resource 2");
				try {
					Thread.sleep(100);
				} catch(Exception e) {
					System.out.println(e);
				}
				
				synchronized(res1) {
					System.out.println("Thread 2: Locked resource 1");
				}
			}
		}
	};
	
	
	public void run() {
		this.t1.start();
		this.t2.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadlockDemo t1 = new DeadlockDemo();
		new Thread(t1).start();
	}

}
