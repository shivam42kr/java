package Lec11;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 4, 6, 7, 8, 1};
		InsertElement(arr, arr.length-1);
		System.out.println(arr.length);
		for(int i= 0; i < arr.length; i++) {
       	 System.out.print(arr[i]+" ");
        }
	}
	public static void InsertElement(int[] arr, int i) {
		int j = i-1;
		int item = arr[i];
		while(j >= 0 && arr[j] > item) {
			arr[j+1] = arr[j];
			arr[j] = item;
			j--;
		}
	}

}
