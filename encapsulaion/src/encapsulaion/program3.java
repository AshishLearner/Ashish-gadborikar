package encapsulaion;

public class program3 {
	//read and write
	
	private int empid =1000;
	private double salary=5000;
	
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid=empid;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}

	public static void main(String[] args) {
		program3 p3=new program3();
		System.out.println(p3.getsalary());
		System.out.println(p3.getempid());
	//	p3.setempid(1500);
	//	System.out.println(p3.getempid());
		double updatedsalary= p3.getsalary()+1400;
		System.out.println(updatedsalary);
	//
		System.out.println(p3.getsalary());//5000
		p3.setsalary(8000);
		p3.setempid(2564);
		System.out.println(p3.getsalary());
		System.out.println(p3.getempid());
		
		

	}

}
