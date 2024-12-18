package Lec46;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {
//hackathon
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		String str = sc.next();
		String str = "abababaaaabababa";
		int k = 2;
		int flipa = MaximumLength(str, k, 'a');
		int flipb = MaximumLength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int MaximumLength(String s, int k, char ch) {
		int flip = 0;
		int si = 0, ei = 0, ans = 0;
		while (ei < s.length()) {
			// window grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			//window shrink
			while (flip > k && si <= ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			//ans calculate
			ans = Math.max(ans, (ei - si + 1));
			ei++;
		}
		return ans;
	}

}
