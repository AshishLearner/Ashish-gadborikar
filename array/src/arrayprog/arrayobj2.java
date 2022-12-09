package arrayprog;

class pune1 {
	int salary=2500;
	void decan() {
		System.out.println("i am in pune");
	}
}
class mahrashtra1 extends pune1{
	void display(){
		System.out.println("IT city");
	}
}

public class arrayobj2 extends maharashtra {
	void call() {
		System.out.println("calling ......");
	}
	public static void main(String[] args) {
		pune1 obj1[]=new pune1[3];
		obj1[0]=new pune1();
		obj1[1]=new pune1();
		obj1[2]=new pune1();
//		pune1 p2=new pune1();//
//		p2.salary=5000;//
//		
		obj1[0].salary=2000;
		System.out.println(obj1[0].salary);
		obj1[0].decan();
		System.out.println(obj1[1].salary);//it will print salary of 2500 bcs we can not assign the value for obj [1]
		obj1[1].decan();
		obj1[2].salary=5600;
		System.out.println(obj1[2].salary);
		obj1[2].decan();
	
	}

}
