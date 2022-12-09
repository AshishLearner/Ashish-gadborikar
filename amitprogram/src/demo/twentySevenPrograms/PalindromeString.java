package demo.twentySevenPrograms;

import java.util.*;

public class PalindromeString {
	
	public static void main() {
		
		String str, reverse = "";
		int len, i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string to check if it is a palindrome : ");
		str = scan.nextLine();
		
		scan.close();
		
		len = str.length();
		
		for(i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Reversed string : "+ reverse);
		
		if (str.equals(reverse)) {
			System.out.println("Entered string is palindrome.");
		}
		else {
			System.out.println("Entered string is not palindrome.");
		}
		
	}

	public static void main(String[] args) {
		main();
	}

}
