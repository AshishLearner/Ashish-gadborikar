package wrapperclass;

public class program2 {

	public static void main(String[] args) {
		Double doubleobj= 25.32;//implicit boxing
		System.out.println("Doubleobj :"+doubleobj);
		//only boxed object can be unboxed
		Double salary=doubleobj.doubleValue();
		System.out.println(salary);
		System.out.println(salary.equals(doubleobj));
		System.out.println(salary==doubleobj);
		Integer obj=new Integer(5);
		int i=obj.intValue();
		System.out.println(i);
		System.out.println(obj.equals(i));
		System.out.println(obj==i);
	}

}
