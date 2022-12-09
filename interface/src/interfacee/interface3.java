package interfacee;
interface printable{
	int age=30;
	void print();
}
interface showable{
	void show(); 	
}
 class interface3 implements printable,showable {
	 public void print() {
		 System.out.println("hello print");
	 }
	 public void show() {
		 System.out.println("hello show");
	 }

	public static void main(String[] args) {
	interface3 i3=new interface3();
	i3.print();
	i3.show();
	System.out.println(i3.age);

	}

}
