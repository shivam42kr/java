package Lec45;

public class Single_Number {
//leetcod 136
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4, 1, 2, 1, 2};
		System.out.println(SingleNumber(arr));
	}
	public static int SingleNumber(int [] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^arr[i];
		}
		return ans;
	}

}
