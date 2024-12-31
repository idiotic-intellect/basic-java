package basic;

import java.util.ArrayList;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {7, 12, 13,  9, 11, 3};
		System.out.print("Bubble Sort Result: ");
		for(int n: Bubble(arr))
			System.out.print(n + ", ");
		System.out.println();
		arr = new int[] {7, 12, 13, 9, 11, 3};
		System.out.print("Selection Sort Result: ");
		for(int n: Selection(arr))
			System.out.print(n + ", ");
		System.out.println();
		arr = new int[] {7, 12, 13, 9, 11, 3};
		System.out.print("Insertion Sort Result: ");
		for(int n: Insertion(arr))
			System.out.print(n + ", ");
		System.out.println();
		arr = new int[] {7, 12, 13, 9, 11, 3};
		System.out.print("Quick Sort Result: ");
		Quick(arr, 0, arr.length-1);
		for(int n: arr)
			System.out.print(n + ", ");
		System.out.println();
		arr = new int[] {4, 2, 2, 6, 3, 3, 1, 6, 5, 2, 3};
		System.out.print("Counting Sort Result: ");
		for(int n: Counting(arr))
			System.out.print(n + ", ");
		System.out.println();
		arr = new int[] {170, 45, 75, 90, 802, 24, 2, 66};
		System.out.print("Radix Sort Result: ");
		for(int n: Radix(arr))
			System.out.print(n + ", ");
		System.out.println();
		float[] arr1 = new float[] {3, 7, 6, -10, 15, (float) 23.5, 55, -13};
		System.out.print("Merge Sort Result: ");
		for(float n: Merge(arr1))
			System.out.print(n + ", ");
		System.out.println();
	}
	
	static int[] Bubble(int arr[]) {
		int m = arr.length - 1;
		for(int i=0; i< m; i++) {
			for(int j=0; j < m-i; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		return arr;
	}
	
	static int[] Selection(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[i]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}
	
	static int[] Insertion(int arr[]) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int swap = 0;
			int arr1[] =  new int[n];
			for (int j=0; j < n; j++) {
				if( swap == 0 && j < i && arr[i] < arr[j]) {
					arr1[j] = arr[i];
					arr1[j+1] = arr[j];
					swap = 1;
					
				} else if(i == j && swap==1) { swap = 0;}
				else {
					arr1[j + swap] = arr[j];
				}
			}
			arr = arr1;
		}
		return arr;
	}
	
	static void swap(int[] arr, int i1, int i2) {
		int n = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = n;
	}
	
	static int parti(int[] arr, int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j=low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				if(i != j)
					swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}
	
	static void Quick(int arr[], int low, int high) {
		if(low < high) {
			int pi = parti(arr, low, high);
			Quick(arr, low, pi-1);
			Quick(arr, pi+1, high);
		}
	}
	
	static int findMax(int arr[]) {
		int max = arr[0];
		int n = arr.length;
		for(int i=1; i<n; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	static int[] Counting(int arr[]) {
		int max = findMax(arr)+1;
		int[] count = new int[max];
		int n = arr.length;
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		int i=0, j=0;
		while(i<n) {
			while(count[j] != 0) {
				arr[i] = j;
				count[j]--;
				i++;
			} 
			j++;
		}
		return arr;
	}
	
	static int[] Radix(int arr[]) {
		int max = findMax(arr);
		int exp = 10;
		int maxSize = String.valueOf(max).length();
		int l = maxSize;
		List<Integer>[] array = new ArrayList[10];
		array[0] = new ArrayList<Integer>();
		array[1] = new ArrayList<Integer>();
		array[2] = new ArrayList<Integer>();
		array[3] = new ArrayList<Integer>();
		array[4] = new ArrayList<Integer>();
		array[5] = new ArrayList<Integer>();
		array[6] = new ArrayList<Integer>();
		array[7] = new ArrayList<Integer>();
		array[8] = new ArrayList<Integer>();
		array[9] = new ArrayList<Integer>();
		while(maxSize > 0) {
			for(int i=0; i<arr.length; i++) {
				int val = (int) (Math.floor(arr[i]/Math.pow(10, l-maxSize)) % 10);
				array[val].add(arr[i]);
			}
			int m=0;
			for(int i=0; i< array.length; ) {
				while(array[i].size() != 0) {
					arr[m] = array[i].remove(0);
					m++;
				}
				i++;
			}
			maxSize--;
		}
		return arr;
	}
	
	static float[] returnSubArray(float[] arr, int start, int end) {
		float res[] = new float[end-start];
		for(int i=start, j=0; i<end; i++,j++) {
			res[j] = arr[i];
		}
		return res;
	}
	
	static float[] addRemainingArray(float[] arr, int start, int end, float[] res, int resS) {
		for(int i=start; i< end; i++,resS++) {
			res[resS] = arr[i];
		}
		return res;
	}
	
	static float[] MergeSort(float[] arrA, float[] arrB) {
		int m = arrA.length, n = arrB.length;
		int k = 0, i=0, j=0;
		float res[] = new float[m+n];
		while(i<m && j<n) {
			if(arrA[i] < arrB[j]) {
				res[k] = arrA[i];
				k++; i++;
			} else {
				res[k] = arrB[j];
				k++; j++;
			}
		}
		if(m > i) {
			res = addRemainingArray(arrA, i, m, res, k);
		}
		if(n > j) {
			res = addRemainingArray(arrB, j, n, res, k);
		}
		return res;
	}
	
	static float[] Merge(float[] arr) {
		if(arr.length <=1)
			return arr;
		int mid = (int) Math.floor(arr.length/2);
		float[] arrA = Merge(returnSubArray(arr, 0, mid));
		float[] arrB = Merge(returnSubArray(arr, mid, arr.length));
		
		return MergeSort(arrA, arrB);
	}

}
