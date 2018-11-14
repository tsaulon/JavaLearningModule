package W9;

import java.util.Arrays;
import java.util.List;

//	Introducing lambdas

@FunctionalInterface
interface Operation {
	boolean isMin(int a, int b);	//	declare function signature using interface
}

@FunctionalInterface
interface ReferenceToInstanceObj {
	void display();
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
	
		List<String> someBingoNumbers = Arrays.asList(
				"N40", "N36",
				"B12", "B6",
				"G53", "G49", "G60","G50",
				"I26", "I17", "I29",
				"O71");
		
		//	working with streams
		someBingoNumbers
		.stream()
		.map(s -> s.toUpperCase())
		.filter(s -> s.startsWith("G"))
		.sorted()
		.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		
		//	Method reference to instance object
		main myObj = new main();	//	'main' refers to self-class
		ReferenceToInstanceObj ref = myObj::display;
		ref.display();
		
	}

	
	public static String bar(int x, HelloWorld hw) {
		return hw.greeting();
	}
	
	//	Setting Functional interface as parameters
	public static boolean foo(int a, int b, Operation o) {
		return o.isMin(a, b);
	}
	
	public void display() {
		System.out.println("Hello");
	}
}