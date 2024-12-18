package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
         // Leetc 131.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		List<String> ll = new ArrayList<>();
		Partitioning(s, "");

	}
	public static void Partitioning(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 1; i <= ques.length(); i++) {  
			String s = ques.substring(0, i); // i = 0 se start hoga to i+1 kerna  
			if(isPalindrome(s)) {            // padhega esliye i=1..
			Partitioning(ques.substring(i), ans + s + "|");
			}
		}	
	}
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true ;
	}
}