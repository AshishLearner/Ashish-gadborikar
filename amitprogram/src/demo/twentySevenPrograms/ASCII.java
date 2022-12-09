package demo.twentySevenPrograms;

import java.util.Scanner;

public class ASCII {
	
	public static void main() {
		
		char ch;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ehter the character to find ASCII value : ");
		ch = scan.next().charAt(0);
		
		scan.close();
		
		int ascii = (int)ch;
		
		System.out.println("The ASCII value of " + ch + " is : " + ascii);
	}

	public static void main(String[] args) {
		main();
	}

}
