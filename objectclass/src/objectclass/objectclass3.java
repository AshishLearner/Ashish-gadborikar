package objectclass;

class demo123{
	void dispplay() {
		System.out.println("i am display() of class demo");
	}
}

public class objectclass3 extends demo123 {
	static int last_roll=100;
	int roll_no;
	objectclass3(){
		roll_no=last_roll;
		last_roll++;
	}
	//overide
	public int hashCode() {
		return roll_no;
	}
	public static void main(String[] args) {
		objectclass3 obj3=new objectclass3();
		System.out.println(obj3);
		System.out.println(obj3.hashCode());
		obj3.dispplay();
		demo123 d=new demo123();
		System.out.println(d);
		System.out.println(d.hashCode());
		
		
	}

}

