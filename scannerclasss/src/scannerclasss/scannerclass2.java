package scannerclasss;

import java.util.Scanner;

public class scannerclass2 {

	public static void main(String[] args) {
	String S="Hello , This is Basicjava";
	//create scanner object and pass sring in it.
	Scanner Scan = new Scanner(S);
	//check if Scanner has a token.
	System.out.println("boolean result : "+Scan.hasNext());//true
	//print the string
	System.out.println("string  :"+Scan.nextLine());
	Scan.close();
	System.out.println("  Enter your detail  ");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=in.next();
	System.out.println("Enter youe age");
	int age=in.nextInt();
	System.out.println("Ener your slalary");
	double salary=in.nextDouble();
	in.close();
	System.out.println("name : "+name);
	System.out.println("age : "+age);
	System.out.println("salary: "+salary);
	
		
	}

}
