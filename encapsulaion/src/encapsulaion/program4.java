package encapsulaion;

public class program4 {
	
	private String name;
	
	public String getname() {
		return name;
	}
	public void setname(String newname) {
		this.name=newname;
	}

	public static void main(String[] args) {
		program4 p4=new program4();
	//	System.out.println(p4.getname());//null
		p4.setname("ashish");
		System.out.println(p4.getname());
		

	}

}
