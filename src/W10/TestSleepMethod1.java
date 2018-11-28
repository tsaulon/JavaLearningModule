package W10;

//	Multi-threading demo
public class TestSleepMethod1 extends Thread {

	public void run() {
		for(int i = 0; i < 5; ++i) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		
		t1.start();
		t2.start();
	}

}
