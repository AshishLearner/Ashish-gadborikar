package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class textfilehandling {

	public static void main(String[] args) throws IOException {
		 // creating file using 
		/*File file = new File("ashish.txt");
		file.createNewFile();
		file.canWrite();
		System.out.println(" file name is : "+file.getName());*/
		// write file
		FileWriter myWriter= new FileWriter("ashish.txt");
		myWriter.write("its my first file creation");
		myWriter.close();
		// reading file
		
		
	}

}
