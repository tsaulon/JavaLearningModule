import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Highest number between 10 and 15: " + max(10, 15));
		
		//	Array Syntax
		int [] firstArray = new int[10];
		int secondArray[] = new int[5];
		
		//	Initializing Arrays (3 Methods)
		double[] firstList = {1.9, 2.9, 3.4};	//	first
		double secondList[] = new double[2];	//	second
		secondList[0] = 1.9;
		secondList[1] = 2.9;
		//	for(...){ }	//	third. (Iterate through array and populate using loop.)
		
		//	How to find size of array:
		System.out.println("Size of firstArray: " + firstArray.length);
		System.out.println("Size of secondAray: " + secondArray.length);
		
		//	Copying Arrays (CANNOT COPY USING ASSIGNMENT '=' OPERATOR)
		//	3 Methods:
		//	-	Loop through individual elements.
		//	-	Use static arraycopy method in the System class
		//	-	Use the clone method (..look into this later in semester.)
		
		//	(1) Copying with Loop
		int[] firstCopy = {1, 2, 3, 4};
		int[] firstCopyCopy = new int[firstCopy.length];
		
		for(int i = 0; i < firstCopy.length; i++) {
			firstCopyCopy[i] = firstCopy[i];
		}
		
		System.out.println("firstCopy: " + printArray(firstCopy));
		System.out.println("firstCopyCopy: " + printArray(firstCopyCopy));
		
		//	(2) Copying with System.arraycopy() Method
		int[] secondCopy = {5, 6, 7, 8};
		int [] secondCopyCopy = new int[secondCopy.length];
		System.arraycopy(secondCopy, 0, secondCopyCopy, 0, secondCopy.length);
		
		System.out.println("secondCopy: " + printArray(secondCopy));
		System.out.println("secondCopyCopy: " + printArray(secondCopyCopy));
		
	}
	
	public static String printArray(int[] arr) {
		
		String string = "[ ";
		
		for(int i = 0; i < arr.length; i++) {
			string += arr[i];
			
			if(i != arr.length - 1) {
				string += ", ";
			} else {
				string += " ";
			}
		}
		
		string += " ]";
		return string;
	}
	
	public static int max(int first, int second) {
		return first >= second ? first : second;
	}
	
	//	Class methods can be overloaded by:
	//	-	Parameter List
	//	-	Parameter Datatypes
	
	//	Class methods cannot be overloaded by:
	//	-	Return datatype (This causes ambiguity.)
}
