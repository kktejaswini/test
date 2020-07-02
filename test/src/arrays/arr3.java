package arrays;

public class arr3 {
	public static void main(String[] args) {
		int arr[] = {1,4,34,56,7};
		int ele=56;
		int idx=-1;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==ele) {
				idx=i;
				break;
			}
			}
		System.out.println(idx);


	}
}
