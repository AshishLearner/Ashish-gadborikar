package operator;

public class unaryHW {

	public static void main(String[] args) {
		int a = 0 , b;
		b=a++ + ++a + ++a + a ;
		System.out.println(a);//3
		System.out.println(b);//8
		a=0;
		b= a-- + --a + --a + a;
		System.out.println(a);//-3
		System.out.println(b);//-8
		a=0 ;
		b= --a + --a + --a + a + ++a + a++ ;
		System.out.println(a);//-1
		System.out.println(b);//-13
		a=0;
		b= a-- + a + ++a + a++ + ++a + a++ +a;
		System.out.println(a);//3
		System.out.println(b);//6

	}

}
