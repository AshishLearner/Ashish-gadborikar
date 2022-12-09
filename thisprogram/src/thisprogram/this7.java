package thisprogram;

public class this7 {

	//class student101{
		int roll;//100
		float fee;//605
		
	   this7(int roll){//100
			this.roll=roll;//100,100
		}
	   this7(int roll, float fee){//89,605
			this(roll);//
			this.fee=fee;//605
		}
		void display() {
			System.out.println(roll+ "  "+fee);//100,0,89,605
			
		}
	
	public static void main(String[] args) {
		this7 s1= new this7(100);
		System.out.println(s1.roll+ " "+s1.fee);//100,0.0
		this7 s2=new this7(89,605f);
		System.out.println(s2.roll+"  "+s2.fee);//89,605
		s1.display();
		s2.display();
		

	}

}
