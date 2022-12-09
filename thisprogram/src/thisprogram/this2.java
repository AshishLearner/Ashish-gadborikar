package thisprogram;

public class this2 {
	static int age;
	int  salary;
	int empid;
	void display(int salary) {
		System.out.println("salary "+salary);//4500,2500
		System.out.println("salary "+this.salary);//0,0
		this.salary=750;
		System.out.println("salary "+this.salary);//750,750
	}
	public static void main(String[] args) {
		int age =25;
		System.out.println("age :"+age); //25
		System.out.println("age: "+this2.age);//0
		int salary =350;
		int empid=458;
		System.out.println("local variable :"+salary);//350
		System.out.println("local variable :"+empid);//458
		this2 t1=new this2();                              //object creation
		System.out.println("t1: global emp id : "+t1.empid);//0
		System.out.println("t1 : global salary: "+t1.salary);//0
		t1.display(4500);                                     // methode call
		System.out.println("t1 : global salary: "+t1.salary);//4500
		this2 t2 = new this2();
		System.out.println("t2 : global empid "+t2.empid);//0
		System.out.println("t2 ; global salary: "+t2.salary);//750
		t2.display(2500);                                      // methode call
		
		
		

	}

}
