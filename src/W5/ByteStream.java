package W5;

import java.io.*;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		
		//	BYTE STREAM SOLUTION
		//	To demo, remove contents of outTmp.txt and run the solution.
		
		File inTmp = new File("inTmp.txt");
		File outTmp = new File("outTmp.txt");
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try {
			input = new FileInputStream(inTmp.getAbsolutePath());	//	get absolute path of files inside JAC444.
			output = new FileOutputStream(outTmp.getAbsolutePath());
			
			int c;
			while((c = input.read()) != -1) {
				output.write(c);	//	write to output file.
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
