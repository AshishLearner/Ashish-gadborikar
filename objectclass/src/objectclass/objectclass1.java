package objectclass;

class demo{
	void display() {
		System.out.println("i am display");
	}
}

public class objectclass1 extends demo {
	
	static int last_roll =100;
	int roll_no;
	objectclass1(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		objectclass1 obj = new objectclass1();
		System.out.println(obj);
		System.out.println(obj.toString());
		demo d1=new demo();
		System.out.println(d1);
		demo d2=new demo();
		System.out.println(d2);
		System.out.println(d2.toString());
		demo d3=new objectclass1();
		System.out.println(d3);
		

	}

}
