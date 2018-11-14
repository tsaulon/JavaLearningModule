package W9;

//	Introducing lambdas

@FunctionalInterface
interface Operation {
	boolean isMin(int a, int b);	//	declare function signature using interface
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation fi = (a, b) -> { return a < b; };	//	implement logic here
		System.out.println(fi.isMin(5, 4));	//	isLesser
		
		HelloWorld hw = new HelloWorld() {
			
			String name = "toute le monde";
			
			public String greeting() {
				return this.name;
			}
		};
		
		System.out.println(bar(1, hw));
		System.out.println(foo(5, 4, (x, y) -> { return x > y; }));	//	isGreater
		
	}

	
	public static String bar(int x, HelloWorld hw) {
		return hw.greeting();
	}
	
	//	Setting Functional interface as parameters
	public static boolean foo(int a, int b, Operation o) {
		return o.isMin(a, b);
	}
}