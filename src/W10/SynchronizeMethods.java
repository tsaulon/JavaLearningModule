package W10;

public class SynchronizeMethods extends Thread {

	Table t;
	int size;
	
	SynchronizeMethods(Table t, int size) {
		this.t = t;
		this.size = size;
	}
	
	public void run() {
		t.printTable(size);
	}
	
	public static void main(String[] args) {
		
		SynchronizedMethod();
		//	Synchronized Block Solution
		
	}
	
	public static void SynchronizedMethod() {
		//	Synchronized Method Solution
		Table obj = new Table();
		SynchronizeMethods t1 = new SynchronizeMethods(obj, 5);
		SynchronizeMethods t2 = new SynchronizeMethods(obj, 100);
		
		t1.start();
		t2.start();
	}

}
