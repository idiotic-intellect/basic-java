package basic;

public class Search {

	public static void main(String[] args) {
		int arr[] = new int[] {3, 7, 2, 9, 5};
		int find = 9;
		System.out.println(linear(arr, find));
		arr = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		find = 15;
		System.out.println(binary(arr, find));
	}
	
	static String linear(int arr[], int find) {
		int n =  arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == find)
				return "Element found at " + (i+1) + " postion of the Array";
		}
		return "Element Not Found";
	}
	
	static String binary(int arr[], int find) {
		int left = 0, right = arr.length-1;
		int mid = 0;
		while(left <= right) {
			mid = (int) Math.floor((left+right)/2);
			if(find < arr[mid]) {
				right = mid-1;
			}
			if(find > arr[mid]) {
				left = mid + 1;
			}
			if(find == arr[mid]) {
				return "Element found at " + (mid+1) + " position of the Array";
			}
		}
		return "Elements Not Found";
	}

}
