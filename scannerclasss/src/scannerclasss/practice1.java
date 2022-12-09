package scannerclasss;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num1,num2;
	char op;
	double result;
	System.out.println("enter no 1");
	num1=s.nextInt();
	System.out.println("enter no 2");
	num2=s.nextInt();
	System.out.println("pass operator: ");
	op=s.next().charAt(0);
	if(op=='+') {
		System.out.println(result=num1+num2);
	}
		else if(op=='*'){
		System.out.println(result=num1*num2);
	}   else if(op=='-'){
		System.out.println(result=num1-num2);
	}   else if(op=='/'){
		System.out.println(result=num1/num2);
	}
	else {
			System.out.println("no operator found");
		}
			
	}

}
