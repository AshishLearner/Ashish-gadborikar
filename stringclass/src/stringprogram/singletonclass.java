package stringprogram;

class demo1223{
	//rule1 constructor should be private
	private demo1223() {
		System.out.println("i am a zero parameerter");
		}
	// rule2 static instance
	static demo1223 d1=new demo1223();
	String name="pune";
	//rule3 static methode with return type as class
	static demo1223 getinstance() {
		return d1;
	}
	void print() {
		System.out.println("i am print () of singleon class demo1223");
		}
	}
public class singletonclass {

	public static void main(String[] args) {
	demo1223 d1=demo1223.getinstance();
	d1.print();
	System.out.println(d1.name);
	d1.name="banglore";
	System.out.println("d1.ref "+d1.name);//banglore
	demo1223 d2=demo1223.getinstance();
//	demo1223 d2=new demo1223();// no possible
	System.out.println("d2.ref "+d2.name);//banglore,,,bcs sigleton class concept
	
	
	/*demo1223.d1.getinstance();
	System.out.println(demo1223.d1.name);
	demo1223.d1.print();
	demo1223.d1.name="banglore";
	System.out.println(demo1223.d1.name);*/
	
	}

}
