package encapsulaion;

public class program6 {
	private long accno;
	private String name,email;
	private float amount;
	
	public long getaccno() {
		return accno;
	}
	public String getname() {
		return name;
		
	}
	public String getemail() {
		return email;
	}
	public float getamount() {
		return amount;
		
	}
	public void setaccno(long newaccno) {
		this.accno=newaccno;
	}
	public void setname(String newname) {
		this.name=newname;
	}
	public void setemail(String newemail) {
		this.email=newemail;
	}
	public void setamount(float newamount) {
		this.amount=newamount;
	}

	public static void main(String[] args) {
		program6 p6 = new program6();
		p6.setamount(1000);
		p6.setaccno(123456789);
		p6.setname("ashish");
		p6.setemail("ashishgadborikar@gmail.com");
		System.out.println("name is :"      +p6.getname());
		System.out.println("email is :"     +p6.getemail());
		System.out.println("account no is :"+p6.getaccno());
		System.out.println("amount is :"    +p6.getamount());
	}

}
