package W10;

public class SyncBlock implements Runnable {

	private String holdA = "This is ";
	private int[] holdB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	synchronized public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(holdA + holdB[i] + ".");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SyncBlock t1 = new SyncBlock();
		new Thread(t1).start();
		new Thread(t1).start();
		
	}

}
