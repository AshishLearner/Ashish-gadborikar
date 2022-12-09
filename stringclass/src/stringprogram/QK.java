package stringprogram;

public class QK {

	public static void main(String[] args) {
		int j;
		// find out the common characters in two string
		String str = "ashish";
		String str1 = "gadaiaiborikar";
		int len = str.length();
		int len1 = str1.length();
		char[] NewStr = str.toCharArray();
		char[] NewStr1 = str1.toCharArray();
		int count = 0;
		for (int i = 0; i <= NewStr.length ; i++) {
			for (j = 0; j <= NewStr1.length ; j++) {
				if (NewStr[i] == NewStr1[j]) {
					count++;
					// System.out.println(count+" : "+NewStr[i]);
				}
			}
			try {
				if (count >= 1 && NewStr[i] == NewStr1[j]) {
				}
			} catch (Exception e) {

				System.out.println("occurence of character : "+NewStr[i]+ " is "+count);
				count = 0;
				
			}

		}

	}

}
