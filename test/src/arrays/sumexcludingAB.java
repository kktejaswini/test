package arrays;

public class sumexcludingAB {
	public static void main(String[] args) {
		int arr[] = {7,1,2,3,6};
		boolean con = true;
		int a = 6;
		int b = 7;
		int sum=0;

		for (int i=0;i<arr.length;i++) {
			if (arr[i]!=a && con==true) {
				sum+=arr[i];
			}
			else if (arr[i]==a) {
				if((i) == arr.length-1)
	                sum+=arr[i];
	            else {
				con=false;
	            }

			}
			else if(arr[i]==b) {
				con=true;
			}
		}
		System.out.print(sum);

	}
}
