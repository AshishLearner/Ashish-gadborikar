package objectclass;

public class objectclass5 {
	static int last_roll=100;
	int roll_num;
	objectclass5(){
		roll_num=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		objectclass5 obj5=new objectclass5();
		System.out.println(obj5);
		System.out.println(obj5.hashCode());
		objectclass5 obj6=new objectclass5();
		System.out.println(obj6);
		System.out.println(obj6.hashCode());
		System.out.println(obj5.equals(obj6));
//		objectclass5 obj7=obj5;
//		System.out.println(obj7.equals(obj5));
//		
		
		

	}

}
