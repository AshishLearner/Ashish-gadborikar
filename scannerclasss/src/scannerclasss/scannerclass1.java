package scannerclasss;

import java.util.Scanner;
public class scannerclass1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age ;
		double valid;
		float nik;
		String name;
		char op;
		/*System.out.println("get age");
		age=sc.nextInt();
		System.out.println("get salary");
		valid=sc.nextDouble();
		System.out.println("get floatvalue");
		nik=sc.nextFloat();
		System.out.println("pass a name");
		name=sc.next();
		System.out.println("age  "  +age);
		System.out.println("valid"  +valid);
		System.out.println("nik  "  +nik);
		System.out.println("name "  +name);
		System.out.println("pass character");*/
		int num1,num2;
		System.out.println("get 1st no");
		num1=sc.nextInt();
		System.out.println("get 2nd no");
		num2=sc.nextInt();
		//System.out.println("pass operator");
		//op=sc.next().charAt(0);
		System.out.println("result"+(num1+num2));
	}

}
