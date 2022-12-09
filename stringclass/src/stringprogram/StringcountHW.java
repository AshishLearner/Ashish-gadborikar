package stringprogram;

public class StringcountHW {
	
	static void getcount(String S) {
		char array[]= S.toCharArray();
		int letter=0,space=0,num =0,other=0,uppercase=0;
		
		for(int i=0;i<S.length();i++) {
			if(Character.isLetter(array[i])) {
				letter++;
			}else if(Character.isSpace(array[i])) {
				space++;
				
			}else if(Character.isDigit(array[i])) {
				num++;
//			}else if(Character.isUpperCase(array[i])) {
//				uppercase++;
			}else
				other++;

			
		}
		System.out.println("num   =   "+num);
		System.out.println("leter =   "+letter);
		System.out.println("space =   "+space);
	//	System.out.println("uppercase = "+uppercase);
		System.out.println("other   =   "+other);
		
		
	}

	public static void main(String[] args) {
		getcount("MY Address is itwari pth umred @ nagpur 4410265");
		
	}

}
