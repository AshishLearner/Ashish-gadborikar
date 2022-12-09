package org.inf.finnal;

public class final3 {
	final int speedlimit;
	final3(){
		speedlimit=10;
		System.out.println(speedlimit);//10
	}
	/*final3(int i){

		speedlimit=i;
		System.out.println(speedlimit);
	}*/
	public static void main(String[] args) {
		final3 f=new final3();
		System.out.println(f.speedlimit);//10
		/*final3 f1= new final3(5);
		System.out.println(f1.speedlimit);
		
*/
	}

}
//is se pahle ki speedlimit ko default value mile constructor call hota hai aur use value mil jati hai
// ek object ke ander kiya gaya change dusre object mai impact nahi dalta