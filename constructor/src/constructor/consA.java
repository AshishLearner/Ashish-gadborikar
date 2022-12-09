package constructor;

public class consA {
	 int roll;
	 double salary;
	 consA(int r,double s){
	 roll=r;
	 salary=s;
	 }
	/** consA(){
		 roll=20;
		 salary=800;
		 }**/
	 void display() {
		 System.out.println(roll);
		 System.out.println(salary);
	 }
	public static void main(String[] args) {
		consA c= new consA(101,20.25);
		c.display();
		consA c1=new consA(178,90.65);
		c1.display();
		/**consA c2= new consA();//to handle thise constructor need to create default constructor, bcs thise constructor is not parameterised
		c2.display();**/
		
	}

}
