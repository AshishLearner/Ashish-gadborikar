package operator;

public class unary {

	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println("a :"+a);//10
		System.out.println("b :"+b);//10
		int k=++a ;
		System.out.println("k :"+k);//11
		System.out.println("a :"+a);//11
		int j=k++;
		System.out.println("k :"+k);//12
		System.out.println("j :"+j);//11
		int r=17;
		System.out.println("r= :"+ r++);//17
		System.out.println("r= :"+r);//18
		System.out.println("r= :"+ ++r);//19
		System.out.println("r= :"+r);//19
		int x= 56;
		System.out.println("x :"+ --x);//55
		System.out.println("x :"+x);//55
		System.out.println("x :"+ x--);//55
		System.out.println("x :"+x);//54

	}

}
