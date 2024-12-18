package Lec16;

import java.util.Scanner;

public class Print_subString_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "axbeiauzlblckiov";
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(PlayingwithString(s));

	}
	public static int PlayingwithString(String s) {
		int ans = 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(vowels(ch) == true) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans, count);
		return ans;
	}
	public static boolean vowels(char ch) {
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}

}

		
