package Lec_2;

public class occurence_of_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=36343;
		int count = 0;
		int digit = 3;
		while(n>0) {
			int rem = n%10;
			n=n/10;
			if(rem == digit) {
				count++;
			}
//			n=n/10;
		}
		System.out.println(count);
	}
}
