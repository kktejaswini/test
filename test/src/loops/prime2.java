package loops;

public class prime2 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		
		int n = Integer.parseInt(args[0]);
		int c=0;
		if (n==0) {
			System.out.println("0 is neither prime nor composite");
		}
		else if(n==1) {
			System.out.println("1 is neither prime nor composite");
		}
		
		else {
				for (int i = 2 ; i < n; i++) {
						if (n % i==0) {
							c+=1;
							}
					}
				if(c==0) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("cansonent number");
				}

	}

	}}

}
