package overidding;

class AA {
		void reverseNumber(int a) {
		int i, p = 1234, sum = 0, r;
		for (i = 0; p > 0; i++) {
			r = p % 10;
			sum = sum * 10 + r;
			p = p / 10;
			System.out.println(sum);
		}
	}
		void palindrome(int b) {

		}
		void leapyear(int yr) {
			
			System.out.println("checking the year");
			if (yr % 6 == 0) {
				System.out.println(" the year is leap year" + yr);
			} else {
				System.out.println("the year is non leap year" + yr);
			}

		}
	}
class BB extends AA{
	void reverseNumber(int p) {
		super.reverseNumber(p);
		int i,  sum = 0, r;
		for (i = 0; p > 0; i++) {
			r = p % 10;
			sum = sum * 10 + r;
			p = p / 10;
			System.out.println(sum);
		}
	}
		void palindrome(int b) {
			super.palindrome(18);

		}
		void leapyear(int yr) {
			super.leapyear( yr);
			
			System.out.println("checking the year");
			if (yr % 6 == 0) {
				System.out.println(" the year is leap year" + yr);
			} else {
				System.out.println("the year is non leap year" + yr);
			}

		}
	}
	
		public class assigove {

			public static void main(String[] args) {
				BB d=new BB();
				d.leapyear(2000);
				d.palindrome(20);
				d.reverseNumber(1234);

			}

		}

