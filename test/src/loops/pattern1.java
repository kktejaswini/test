package loops;

public class pattern1 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("please enter a integer");
			System.exit(0);
		}
		
		int n = Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}
