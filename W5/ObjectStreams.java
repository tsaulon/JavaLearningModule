package W5;

import java.io.*;

public class ObjectStreams {

	public static void main(String[] args) throws IOException {

		File outFile = new File("outObject.dat");
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile.getAbsolutePath()))) {
			out.writeUTF("Tyrone");
			out.writeDouble(3.1456);
			out.writeObject(new java.util.Date());
			System.out.println("Success!");
		}
		
		File inFile = new File("inObject.dat");
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(inFile.getAbsolutePath()))) {
			String name = in.readUTF();
			double score = in.readDouble();
			java.util.Date date = (java.util.Date)in.readObject();
			System.out.println(name + " " + score + " " + date);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
