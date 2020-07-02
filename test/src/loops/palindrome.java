package loops;

public class palindrome {
	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);
		 int sum=0;
		 int n=number;
		while (number!=0) {
			sum=sum*10+number%10;
			number=number/10;
		}
		if (n==sum) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}
}
