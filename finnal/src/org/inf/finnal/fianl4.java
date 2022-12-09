package org.inf.finnal;

public class fianl4 {
	int cube(final int n) {
		System.out.println(n);
	//	n = n+2;                 //   reinitialise kar rahe hai isiliye error aa raha tha
		return n*n*n;
	}

	public static void main(String[] args) {
		fianl4 f4=new fianl4();
		
		System.out.println(f4.cube(5));

	}

}
