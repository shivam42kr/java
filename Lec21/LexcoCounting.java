package Lec21;

public class LexcoCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Counting(n, 0);

	}
	public static void Counting(int n, int curr) {
		if(curr > n) {
			return;
		}
		System.out.print(curr+" ");
		int i = 0;
		if(curr == 0) {
			i = 1;
		}
		for(; i <= 9; i++) {
			Counting(n, curr * 10 + i);
		}
	}

}
