package W10;


//	can also use: 	  implements Runnable
public class Multi extends Thread {
	
	//	used to perform thread actions
	@Override
	public void run() {
		System.out.println("Thread started...");
	}
	
	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.start();
		Multi t2 = new Multi();
		t2.start();
	}
	
	
}
