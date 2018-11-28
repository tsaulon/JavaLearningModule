package W10;

//	Test for attempting to execute a thread after being already executed.
public class ThreadTwice1 extends Thread {

	public void run() {
		System.out.println("Thread started...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ThreadTwice1 t1 = new ThreadTwice1();
			Thread t2 = new Thread(t1);
			t2.start();
			t2.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
