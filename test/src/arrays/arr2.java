package arrays;

public class arr2 {
	public static void main(String[] args) {
		int arr[] = {10,85,96,5,2,45,9,68};
		int min = arr[0];
		int max = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}

		System.out.println("min:"+min);
		System.out.println("max:"+max);



	}
}
