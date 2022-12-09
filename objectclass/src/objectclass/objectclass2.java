package objectclass;

public class objectclass2 extends demo {
	static int last_roll=100;
	int roll_no;
	objectclass2(){
		roll_no=last_roll;
		last_roll++;
		
	}

	public static void main(String[] args) {
		objectclass2 obj =new objectclass2();
		System.out.println(obj);
		System.out.println(obj.hashCode());
		demo d4=new demo();// try do not write extends demo and what error you found
		System.out.println(d4);
		System.out.println(d4.hashCode());
		
	}

}
