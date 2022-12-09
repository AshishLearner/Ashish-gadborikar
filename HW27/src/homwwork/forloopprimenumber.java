package homwwork;

import java.util.Scanner;

public class forloopprimenumber {

	public static void main(String[] args) {
		System.out.println("prime number program");
		int i, r=0;
		int p = 100;
	//	Scanner scn = new Scanner(System.in);
	//	System.out.println("enter number ");
	//	p=scn.nextInt();
	//	scn.close();
		for(i=1;i<=p;i++) {
			if(p%i==0) {      //check condition for remainder 0
				r++;         // count for 2 as prime no divide by itself or 1
			}
		}
		if(r==2) {        // once it count for 2 make a new statment
		System.out.println("enter no is prime number");
		}else {
				System.out.println("enter no is natural number");
			}
		}
	}


