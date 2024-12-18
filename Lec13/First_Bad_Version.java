package Lec13;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
	}
	public int firstBadVersion(int n) {
		int si = 1;   // leet code 278..
		int ei = n;
		int ans = 0;
		while(si<=ei) {
			int mid = si+(ei-si)/2;  //this concept is solve for range of bit.
			if(isBadVersion(mid) == true) {
				ans = mid;
				ei = mid - 1;
			}else {
				si = mid + 1;
			}
		}
		return ans;
	}
	public static boolean isBadVersion(int mid) {
		return false;
	}

}
