package org.inf.finnal;

public class Practice {

	public static void main(String[] args) {

		double d=0;
		int a=10;
		int b=0;
		try {
		 d= a/b;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("suraj");
		}
		System.out.println("print division"+ d);
		
		for(int i =0; i<4; i++)
		{
			System.out.println("*");
		}
		
	}

}
