package objectclass;

class print{
	int a=10;
	public int hashCode() {
		return 10;
	}
	public String toString() {
		return "i ma print class string";
	}
	
	public boolean equals(Object obj) {
		print p=(print)obj;
		return (this.a==p.a);
	}
}

public class objectclass6 {
	static int last_roll=100;
	int roll_no;
	objectclass6(){
		roll_no=last_roll;
		roll_no++;
		
	}


	public static void main(String[] args) {
		objectclass6 obj6= new objectclass6();
		System.out.println("obj6:toString of objecclass6 :  "+obj6);
		System.out.println("obj6:hashCOde of objecclass6 :  "+obj6.hashCode());
		objectclass6 obj7= new objectclass6();
		System.out.println("obj7:toString of objecclass6 :  "+obj7);
		System.out.println("obj6:toString of objecclass6 :  "+obj7.hashCode());
		System.out.println("obj6 & obj7 compare: "+obj6.equals(obj7));
		
		
		System.out.println("********************************");
		
		
		print p=new print();
		System.out.println("p: toString of printclass "+p);
		System.out.println("p: hashcode of printclass "+p.hashCode());
		print p1=new print();
		System.out.println("p1: toString of printclass "+p1);
		System.out.println("p1: hashCode of printclass "+p1.hashCode());
		System.out.println("comparing p & p2 :"+p.equals(p1));
		
	

	}

}
