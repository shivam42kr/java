 package Lec21;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		String ans = "";
		PrintParmutation(ques, "");

	}
	public static void PrintParmutation(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.print(ans+" ");
			return ;
		}
		for(int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i + 1);
			char ch = ques.charAt(i);
			PrintParmutation(s1 + s2, ans + ch);		
		}
	}
}
