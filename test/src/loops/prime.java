package loops;

public class prime {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int c=0;
		for (int i = 2 ; i < n; i++) {
			if (n % i==0) {
				c+=1;
			}
		}
		if(c==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}
