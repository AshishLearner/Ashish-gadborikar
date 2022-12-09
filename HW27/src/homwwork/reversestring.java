package homwwork;

public class reversestring {

	public static void main(String[] args) {
		String input =" My name is ashish";
		String output ="";
		int in = input.length();
		for(int i =in-1;i>=0;i--) {
			output = output + input.charAt(i);
			
		}
		System.out.println(output);

	}

}
