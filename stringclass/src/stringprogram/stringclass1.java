package stringprogram;

public class stringclass1 {

	public static void main(String[] args) {
		stringclass1 c1=new stringclass1();
		System.out.println(c1);//string representation of an object because of tostring()
		//string class object creation 1.using literal
		String s1="mumbai"; //new object wuill create string constant pool
		String s2="mumbai"; //no object create as its duplicate object so s2 will point to s1 object
		String s3="banglore";//new object create in string constant pool
		System.out.println("s1 :" +s1);//object value because tostring()is overrided in stringC class
		System.out.println("s2 :" +s2);
		System.out.println("s3 :" +s3);
		System.out.println("s1 character count : "+s1.length());//9
		System.out.println("s2 character count : "+s2.length());//6
		System.out.println("s3 character count : "+s3.length());//8
		System.out.println(s1.startsWith("mu"));//true
		System.out.println(s1.endsWith("bai"));//true
		System.out.println(s1.contains("mb"));//true
//		System.out.println(s1.endsWith("mu"));//false
//		System.out.println(s1.startsWith("bai"));//false
		
	/*	Ouytside string class
		== ......> compare two value
		.equals(obj) ....> compare two object based on there address
		
		Inside string Class
		== ...> compare two object based on there address
		.equals(obj)...> compare two object based on value
		
		*/
		System.out.println("s1 &s2 using equals()  :"+s1.equals(s2));//compare s1 and s2 value..true
		System.out.println("s1 &s2 using ==        :"+(s1==s2));//compare s1 & s2 based on address
		System.out.println("s1 &s3 using equals()  :"+s1.equals(s3));//false
		System.out.println("s1 &s3 using ==        :"+(s1==s3));//false
		
		String s4=new String("mumbai");// two object created and store in 1.constant pool 2.non constant pool
		System.out.println("s4 : "+s4);
		System.out.println("s1 & s4 using equal() :"+ s1.equals(s4));//true
		System.out.println("s1 & s4 using ==      :" +(s1==s4));//false
		String s5= new String("mumbai");
		System.out.println("s5 "+s5);
		System.out.println("s4 & s5 using equal() : "+s4.equals(s5));//true
		System.out.println("s4 & s5 using ==       :" +(s4==s5));//false
		
		
	}

}
