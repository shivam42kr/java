package Lec10;

public class Reversal_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		Rotate(arr, k);
		for(int i= 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Rotate(int[]arr,int k) {
		int n = arr.length;
		k = k%n;
		Reverse(arr, 0, n-k-1); //reverse first n-k element
		Reverse(arr, n-k, n-1); //reverse last ke k element
		Reverse(arr, 0, n-1); //All reverse
	}
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++;
		    j--;
		}
	}
}
