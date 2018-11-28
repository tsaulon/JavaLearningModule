package W10;

public class Multi3 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...");
	}

}
