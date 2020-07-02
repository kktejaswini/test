package loops;

public class loop3 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("No values");
		}
		else {
			String[] a=args;
			for(int i=0;i<a.length;i++) {
			System.out.println(args[i]+",");
		}

	}

	}
}
