package excdeptionhandling1;

public class program1 {

	public static void main(String[] args) {
		System.out.println("program starts from here");
		//1.abnormal statment
		int i=10;
		int j=0/i; // arrithmatic excdeption
		System.out.println("res "+j);
		//2.abnormal statment
		int [] empid=new int[3];
		empid[3]=10; // ArrayIndexoutbounds Exception
		//3. abnormal stament
		String str=null;
		System.out.println(str.length());
		//4.abnormal statment
		String s="abc";
		int num=Integer.parseInt(s);//number format Exception
		System.out.println("num= "+num);
		System.out.println("program end here...");
		
	}

}
