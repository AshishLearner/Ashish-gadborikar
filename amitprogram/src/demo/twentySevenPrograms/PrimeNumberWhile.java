package demo.twentySevenPrograms;

import java.util.Scanner;

public class PrimeNumberWhile {
	
	public static void main() {
		
		int i = 2, num;
		boolean flag = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to check if it is prime : ");
		num = scan.nextInt();
		 
		scan.close();
		 
		while(i <= num / 2) {
			if(num % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		 
		if(!flag) {
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
