package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingtextfile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("ashish.txt");
		Scanner scn = new Scanner(file);
	//	while(scn.hasNextLine()) {
			String str = scn.nextLine();
			System.out.println(str);
			
			
	//	}
		scn.close();
	
		

	}

}
