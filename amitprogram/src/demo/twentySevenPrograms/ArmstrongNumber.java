package demo.twentySevenPrograms;

import java.util.*;

public class ArmstrongNumber {
	
	public static void main() {
		
		int num, temp, rem, res = 0, len = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to check if it is armstrong number : ");
		num = scan.nextInt();
		
		scan.close();
		
		temp = num;
		len = String.valueOf(num).length();
		
		while(temp != 0) {
			rem = temp % 10;
			res += Math.pow(rem, (int)len);
			temp /= 10;
		}
		
		if(res == num) {
			System.out.println(num + " is an Armstrong Number.");
		}
		else {
			System.out.println(num + " is not an Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		main();
	}

}
