package arrayprog;

public class array1 {

	public static void main(String[] args) {
		/*//declaration
		int a[];
		//size initialization
		a=new int [5];
		//or
*/		
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("****************array element without initialzation***********");
		System.out.println("array element count : "+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		System.out.println("****************after initialization*************");
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		System.out.println("************for each loop**********");
		for(int i:a) {
			System.out.println(i);
		}
	}

}
