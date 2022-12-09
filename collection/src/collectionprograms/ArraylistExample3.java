package collectionprograms;

import java.util.ArrayList;

public class ArraylistExample3 {

	public static void main(String[] args) {
		//generic type collection which can store only integer class object
		ArrayList<Integer> al5= new ArrayList<Integer>();
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ajay");
		al1.add("Anuj");
		al1.add("Gaurav");
		System.out.println("an initial list of element :" +al1);//ravi,vijay,ajay,anuj,gaurav
		//Removing specific from arraylist
		System.out.println(" remove vijay from collection :" +al1.remove("Vijay"));//ravi,ajay,anuj,gaurav
		//removing element on the basis of specfic position
		System.out.println("removing index 0 from collection : "+al1.remove(0));//ajay,anuj,gaurav
		System.out.println("after invoking remove(index) methode: "+al1);
		System.out.println("********************************");
		//creaing another arraylist
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumant");
		System.out.println(al2);
		//adding new element to arraylist
		al1.addAll(al2);
		System.out.println(" after adding all :"+al1);//ajay,anuj,gaurav,ravi,hanuman
		al1.addAll(1,al2);// index no 1 par add karo.. ajay, ravi,hanuman,anuj,gaurav
		System.out.println("updated list : "+al1);
		//removing all the new element from arraylist
		al1.removeAll(al2);//
		System.out.println("after involking removeAll() methode : "+al1);//ajay,anuj,gaurav
		//removing on the basis of specific condition
		al1.removeIf(Str -> Str.contains("Ajay"));//here we are using lamda expression
		System.out.println("after involking removeIf()methode : " +al1);//anuj,gaurav
		//removing all element available in List
		al1.clear();
		System.out.println("after involking clear() methode : "+al1.isEmpty());
		
	}

}
