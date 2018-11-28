package W10;

public class Table {

	//	method is bound to thread which invoked this method 
	//	and released upon it's return.
	synchronized public void printTable(int n) {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(400);
			} catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.print(i * n + " ");
		}
		System.out.println(" ");
	}
}
