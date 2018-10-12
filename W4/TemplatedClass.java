package W4;

public class TemplatedClass <T> {

	private T val;
	
	TemplatedClass(T val) {
		this.val = val;
	}
	
	public T getVal() {
		return this.val;
	}
	
	public void setVal(T val) {
		this.val = val;
	}
}
