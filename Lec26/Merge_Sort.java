package Lec26;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 5, 3, 2, 1};
		int[] ans = Sort(arr, 0, arr.length - 1);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
//		TC = o(nlogn);
	}
	public static int[] Sort(int [] arr, int si, int ei) {
		if(si == ei) {     // ye combine kareke de rahaa ha
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei)/2;
		int []fs = Sort(arr, si, mid);
		int[] ss = Sort(arr, mid + 1, ei);
		return Merge_Two_Array(fs, ss);
	}
	public static int[] Merge_Two_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int [] ans = new int [n + m];
		int i = 0, j = 0, k = 0;
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			}else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while(j < m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
	}
}
