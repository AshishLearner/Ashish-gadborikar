package demo.twentySevenPrograms;

import java.util.*;

public class PrimeNumber {
	
	public static void main() {
		
		int i, num, temp = 0;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number to check if it is prime : ");
		 num = scan.nextInt();
		 
		 scan.close();
		 
		 for(i = 2; i <= num - 1; i++) {
			 if(num % i == 0) {
				 temp = temp + 1;
			 }
		 }
		 
		 if(temp == 0) {
			 System.out.println(num + " is a Prime Number.");
		 }
		 else {
			 System.out.println(num + " is a not Prime Number.");
		 }
		 
	}

	public static void main(String[] args) {
		main();
	}

}
