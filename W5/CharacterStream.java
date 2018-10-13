package W5;
import java.io.*;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//	CHARACTER STREAM SOLUTION
		//	Holds character values of 16-bytes
		//	To demo, clear contents of outChar.txt and run the solution.
		
		File inChar = new File("inChar.txt");
		File outChar = new File("outChar.txt");
		FileReader input = null;
		FileWriter output = null;
		
		try {
			input = new FileReader(inChar.getAbsolutePath());
			output = new FileWriter(outChar.getAbsoluteFile());
			
			int c;
			while((c = input.read()) != -1) {
				output.write(c);
			}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(input != null) {
				input.close();
			}
			
			if(output != null) {
				output.close();
			}
		}
		
	}

}
