package encapsulaion;

public class program5 {
	
	private int ssn;
	private String empname;
	private int empid;
	
	
	public int getssn() {
		return ssn;
	}
	public String getempname() {
		return empname;
	}
	public int getempid() {
		return empid;
	}
	public void setssn(int newssn) {
		this.ssn=newssn;// if we are boy use this it will give 0 value
		
	}
	public void setempname(String newempname) {
		this.empname=newempname;
	}
	public void setempid(int newempid) {
		this.empid=newempid;
	}
	

	public static void main(String[] args) {
		program5 p5=new program5();
	//	System.out.println(p5.getempname());//null
	//	System.out.println(p5.getempid());//0
	//	System.out.println(p5.getssn());//0
		p5.setempname("ashish");
		p5.setssn(4568);
		p5.setempid(100);
		System.out.println(p5.getssn());
		System.out.println(p5.getempname());
		System.out.println(p5.getempid());
		
		
	}

}
