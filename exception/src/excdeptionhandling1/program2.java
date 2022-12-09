package excdeptionhandling1;
import java.util.Scanner;
public class program2 {

	public static void main(String[] args) {
		System.out.println("program starts from here..");
		Scanner Scn=new Scanner(System.in);
		//1. abnormal statments
		int i,j,res;
		System.out.println("enter number 1: ");
		i=Scn.nextInt();
		System.out.println("enter number 2 ");
		j=Scn.nextInt();
		try {
			res=i/j;
			System.out.println("res: "+res);
		}
		catch(Throwable e) {
			System.out.println("Exception type : " +e);
		}
		
		System.out.println("program end here");
		
	}

}
