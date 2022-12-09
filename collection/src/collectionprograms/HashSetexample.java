package collectionprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetexample {
	 
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		//in set if you ry to add element then it will neglect that element
		//instead of throwing an error or exception
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		System.out.println("before involking remove(object) methode : "+set);
		//Traversing elements
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removing Ravi from set : "+set.remove("Ravi"));
		System.out.println("after involking remove(object) methode "+set);
		Set<String> set1=new HashSet<String>();
		set1.add("Ajay");
		set1.add("gaurav");
		System.out.println("Set elements : "+set1);
		set.addAll(set1);
		System.out.println("updated list :" +set);
		//removing all new element from HashSet
		set.removeAll(set1);
		System.out.println("after involking removeAll()methode "+set);
		//removing element on the basiss of specified condition 
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("after involking removeIf()methode : "+set);
		//removing alll the element available in set
		set.clear();
		System.out.println("after involking clear()methode : "+set);
		List<String> l1=new ArrayList<String>();
		l1.add("Pune");
		l1.add("Mumbai");
		l1.add("Banglore");
		l1.add("Pune");
		System.out.println("printing list "+l1);
		Set s1=new HashSet();
		s1.add(l1);
		System.out.println("*************" +l1);
		//or
		Set s2=new HashSet(l1);
		System.out.println("****" +s2);
		
		
		
		//print the count of each world of given string
		String str =" i am from pune and pune is it hub , i am staying in dhanori";
		String[] sr1 =str.split(" ");
		List<String> list= Arrays.asList(sr1);
		Set<String> st = new HashSet(list);
		Iterator <String> it=st.iterator();
		for(int i=0;i<st.size();i++) {
			String name=it.next();
			System.out.println(name+ " : " +Collections.frequency(list, name));
		}
		
		
		
		
		
	}
}
