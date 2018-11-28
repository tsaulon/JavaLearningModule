package W10;

public class TestJoinMethod3 extends Thread {

	public void run() {
		System.out.println("Thread started...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestJoinMethod3 t1 = new TestJoinMethod3();
		TestJoinMethod3 t2 = new TestJoinMethod3();

		System.out.println("Name of t1: " + t1.getName());
		System.out.println("Name of t2: " + t2.getName());
		System.out.println("ID of t1: "+ t1.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("Too Raw");
		System.out.println("Post-changes to t1's name: " + t1.getName());
	
	}

}
