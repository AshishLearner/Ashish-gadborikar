package objectclass;

public class objectclass4 {
	static int last_roll=100;
	int roll_no;
	objectclass4(){
		roll_no=last_roll;
		roll_no++;
		
	}
	public String toString() {
		return "basic core java";
		
	}

	public static void main(String[] args) {
		objectclass4 obj4=new objectclass4();
		System.out.println(obj4);
		System.out.println(obj4.toString());
		System.out.println(obj4.hashCode());
		

	}

}
