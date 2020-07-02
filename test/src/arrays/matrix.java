package arrays;

public class matrix {
	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		int n=args.length;
		if (n<4) {
			System.out.println("enter 4 numbers");
		}
		int k=0;
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(args[k++]);

			}

	}

	}
}
