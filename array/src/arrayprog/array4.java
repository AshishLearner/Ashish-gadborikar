package arrayprog;

public class array4 {

	public static void main(String[] args) {
		String[] cars= {"XUV","MGHECTOR","FORTUNER","ODDI"};
//		System.out.println(cars[0]);
//		System.out.println(cars[1]);
//		System.out.println(cars[2]);
//		System.out.println(cars[3]);
//		System.out.println(cars.length);
//		
//		System.out.println("*********normal for loop**********");
//		for(int i=0; i<cars.length;i++) {
//			System.out.println(cars[i]);
//		}
		System.out.println("*** for each loop****");
		for(String i:cars) {
			System.out.println(i);
		}

	}

}
