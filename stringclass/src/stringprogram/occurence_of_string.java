package stringprogram;

public class occurence_of_string {

	public static void main(String[] args) {
	
		String str = "mynameisashish";
		int count =0;
		int j;
		char[] str2 = str.toCharArray();
		
		for(int i=0+1;i<=str2.length-1;i++) {
			
			for( j=0;j<=str2.length-1;j++) {
				if(str2[i]==str2[j]) {
					count++;
					
				}
				
				
			}
			try {
			if(count>=1 && str2[i]==str2[j]) {
				//System.out.println(str2[i]);
				
			}
		}
			catch(Exception e) {
				System.out.println(str2[i]+" :"+count);
				count=0;
				
			}
		}
		
		
		
		
	}

}
