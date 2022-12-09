package demo.twentySevenPrograms;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public static void main() {
		char ch;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the alphabate : ");
		ch = scan.next().charAt(0);
		
		scan.close();
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Entered alphabate is vowel.");
		}
		else {
			System.out.println("Entered alphabate is consonant.");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
