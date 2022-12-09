package constructor;

public class cons4 {
	int roll;
	double salary;
	cons4(int r, double s){
		roll=r;
		salary = s;
		}
	void display () {
		System.out.println(roll+ " "+salary);
	}

	public static void main(String[] args) {
		cons4 c1 = new cons4(101,202.25);
		c1.display();
		cons4 c2 = new cons4(102,454.65);
		c2.display();
		
	}

}
