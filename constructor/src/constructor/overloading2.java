package constructor;

public class overloading2 {
	int age;
	double salary;
	overloading2(){
		System.out.println(" == zero parameterized constructor started==");
		System.out.println("having no parameter");
		System.out.println("==zero parameterized constructor ends==");
	}
	overloading2(int a){
		System.out.println(" ==  parameterized constructor started==");
		System.out.println("having int parameter");
		age=a;
		System.out.println("==int parameterized constructor ends==");
	}
	overloading2(double b){
		System.out.println(" ==  parameterized constructor started==");
		System.out.println("having double parameter");
		salary=b;
		System.out.println("==double parameterized constructor ends==");
	}
	overloading2(int a,double b){
		System.out.println(" ==  parameterized constructor started==");
		System.out.println("having int double parameter");
		age=a;
		salary=b;
		System.out.println("==int parameterized constructor ends==");
	}
	public static void main(String[] args) {
		overloading2 o1=new overloading2();
		System.out.println("after zero parameter consructor , age ="+o1.age);
		System.out.println("after zero parameter consructor , salary ="+o1.salary);
		 overloading2 o2=new overloading2(25);
			    System.out.println("after int parameter consructor , age ="+o2.age);
			    System.out.println("after int parameter consructor , salary ="+o2.salary);
			    overloading2 o3=new overloading2(65.36);
				    System.out.println("after double parameter consructor , age ="+o3.age);
				    System.out.println("after double parameter consructor , salary ="+o3.salary);

				    overloading2 o4=new overloading2(69,45.89);
				    System.out.println("after int double parameter consructor , age =" +o4.age);
				    System.out.println("after int double parameter consructor , salary =" +o4.salary);
	
	}

}
