package stringprogram;

public class retriver_integer_Amla {

	public static void main(String[] args) {
		// Retrive integer from string and add this
		
		String str="pagenot found 404";
		char charcheck=0;
		

		for(int i=0;i<=str.length()-1;i++) {
			charcheck = str.charAt(i);
			if(Character.isDigit(charcheck)) {
				System.out.print(charcheck);
			}
			
			
		}
	
	}
}


