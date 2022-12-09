package stringprogram;

import java.util.ArrayList;

public class countduplicatechar {

	public static void main(String[] args) {

	    // Get the strings from the command line or pass into method.
	    String name1 = "Emyyilyyyyy";
	    String name2 = "Andyyyy";
	    int count = 0;

	    ArrayList<String> cache = new ArrayList<String>();


	    for (int i = 0;i < name1.length();i++)
	    {
	        String check = name1.substring(i, i+1);
	        System.out.println("Letter to check: " + check);
	        if (name2.indexOf(check) != -1)
	        {
	            // Check to see if we already found the character so we don't count it again
	            if (!cache.contains(check))
	            {
	                System.out.println("Found: " + check + " in: " + name2);
	                cache.add(check);
	                count++;
	            }
	        }

	    }
	    System.out.println();
	    System.out.println("Count = " + count);



	    }

	    }