package W10;

public class StaticSync extends Thread {

	int num;
	
	public void run() {
		Table.printStaticTable(this.num);
	}
	
	StaticSync(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticSync t1 = new StaticSync(1);
		StaticSync t2 = new StaticSync(10);
		StaticSync t3 = new StaticSync(100);
		StaticSync t4 = new StaticSync(1000);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
