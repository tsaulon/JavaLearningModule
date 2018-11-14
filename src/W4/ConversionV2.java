package W4;

public interface ConversionV2 {

	double INCH_TO_MM = 25.4;
	double inchToMM(double inches);
	
	//	1: 	Provides default implementation for function
	//	2: 	Classes implementing this interface and method and use this implementation
	//		or override it.
	default public void defaultMethod() {
		System.out.println("Special Implementation");
	}
	
}