package pattern;

public class pattern3 {

	
	public static void main(String[] args) {
		
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3-i;j++) {
			System.out.print(" ");
		}
		
		for(int k =(2*2)-i; k<=3;k++) {
			System.out.print("*");
		
	}
		System.out.println();
	
	}

	}

}
// output of the program

/*

  *
 **
***

*/