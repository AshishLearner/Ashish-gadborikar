package org.inf.finnal;

public class final2 {
	final int empid=20;
	double salary=654;
	
	void num() {
		System.out.println("emp id :"+empid);//20
	}

	public static void main(String[] args) {
	final2 v2= new final2();
	v2.num();
	System.out.println(v2.salary);//654
		

	}

}
