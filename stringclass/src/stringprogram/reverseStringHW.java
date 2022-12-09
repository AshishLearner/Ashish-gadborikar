package stringprogram;

public class reverseStringHW {

	public static void main(String[] args) {
		String reverse="";
		String S="new reverse program";
	
		int length =S.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+S.charAt(i);
			
		}
		System.out.println("Reverse of Enered String is: "+reverse);
	

	}

}
