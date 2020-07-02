package arrays;

public class matrix2 {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int n=args.length;
		if (n<9) {
			System.out.println("enter 9 digits");
		}
		int k=0;
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=Integer.parseInt(args[k++]);
			}
		}

		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		int max=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}

			}
		}

		System.out.println("The biggest number in the given array is " + max);

	}
}
