package Lec18;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2, 3, 4, 3, 4, 7, 2, 5, 9, 8, 11};
		int item = 4;
		System.out.println(Index(arr,item, 0));

	}
	public static int Index(int []arr, int item, int i) {
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == item) {
			return i;
		}
		return Index(arr, item, i+1);
	}

}
