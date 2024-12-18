package Lec19;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintSub(ques, "");   // this "" blank string
     System.out.println(count);
	}
	static int count = 0;
	public static void PrintSub(String ques, String ans) {
		if(ques.length() == 0) {
			count++;
			System.out.print(ans+" ");
			return ;
		}
		char ch = ques.charAt( 0);
		PrintSub(ques.substring(1), ans);
		PrintSub(ques.substring(1), ans + ch);
		
		
	}

}
