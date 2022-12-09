package stringprogram;

public class string2 {

	public static void main(String[] args) {
		String s1 = "i am from MH";
		System.out.println("actual string :" + s1);
		String[] strary = s1.split("   ");
		for (String s : strary) {
			System.out.println(s);
		}
		System.out.println("*****************");
		String s2 = "I am from MH";
		String[] Arr = s2.split("", 2);
		for (String s : Arr) {
			System.out.println(s);
		}
		System.out.println("******************");
		String s3 = "i am from umred now i am in nagpur";
		String[] arr = s3.split("am");
		for (String s : arr) {
			System.out.println(s);
		}
		System.out.println("*****************");
		String S4 = "i am from pune";
		// System.out.println(S4.length());
		String[] ary = S4.split(" ");
		String temp = " ";
		for (int i = ary.length - 1; i >= 0; i--) {
			temp = temp + " " + ary[i];

		}

		System.out.println(temp);
		System.out.println("************");
		String S5= "     i am from nagpur      ";
		System.out.println(S5.length());//provide length
	//	System.out.println(S5.trim());
		System.out.println(S5.trim().length());//provide length after trim
		
		/*S5.concat("mumbai");
		System.out.println(S5);// concate not possible bcs string object is not modifiy it gived o/p as i am from nagpur
		System.out.println(S5.concat("mumbai"));// here will concate but we can not use vairable S5 now
		S5=S5.concat("mumbai");//another methode to concate
*/		}

}
