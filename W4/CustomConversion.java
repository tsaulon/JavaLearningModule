package W4;

public class CustomConversion implements ConversionV1 {

	public double inchToMillimeters(double inches) {
		return inches * ConversionV1.INCH_TO_MM;
	}

}
