package W5;

import java.io.*;

public class LineOrientedStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//	Line-Oriented Solution
		File inFile = new File("inLOS.txt");
		File outFile = new File("outLOS.txt");
		BufferedReader input = null;
		PrintWriter output = null;
		
		try {
			input = new BufferedReader(new FileReader(inFile.getAbsolutePath()));
			output = new PrintWriter(outFile.getAbsolutePath());
			String line;
			while((line = input.readLine()) != null) {
				output.println(line);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(input != null)
				input.close();
			if(output != null)
				output.close();
		}
		
	}

}
