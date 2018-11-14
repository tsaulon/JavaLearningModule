package W4;

public class Main {

	public static void main(String[] args) {
		
		//	Abstract class is a class which contains abstract methods
		//	Circle refers to the abstracted GeometricObject class
		Circle defaultCircle = new Circle();
		Circle paramCircle = new Circle(100, "red", true);
		
		System.out.println(defaultCircle.toString());
		System.out.println(paramCircle.toString());
		
		//	Interface is a collection of abstract methods. (similar to class)
		//	Refer to ConversionV1 and ConversionV2
		//	CustomConversion class will implement these interfaces.
		CustomConversion custom = new CustomConversion();
		System.out.println(custom.inchToMillimeters(5));
		
		//	Generic Classes (Templated Classes)
		TemplatedClass<String> strTemplate = new TemplatedClass<String>("Hello, World!");
		System.out.println("strTemplate: " + strTemplate.getVal());
		TemplatedClass<Boolean> boolTemplate = new TemplatedClass<Boolean>(true);
		System.out.println("boolTemplate: " + boolTemplate.getVal());
		TemplatedClass<Integer> intTemplate = new TemplatedClass<Integer>(100);
		System.out.println("intTemplate: " + intTemplate.getVal());
		
		//	Generic classes cannot use primitive types for it's templating. They must instead
		//	use the primitive Type's wrapper object.
		// 	Error: TemplatedClass<int> intTemplate = new TemplatedClass<int>(100);
		
		
	}

}
