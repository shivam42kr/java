package Lec3;

public class Pattern_p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = n-1;
//		1st
		while(row<=n) {
//			space
			int j = 1;
			while(j<=space) {
				System.out.print("   ");
				j++;
			}
//			star
			int i = 1;
			while(i<=star) {
				System.out.print("*   ");
				i++;
			}
			System.out.println();
			row++;
			star--;
			space--;
		}
//		2nd
		 n = 4;
		int r  = 1;
		int s  = 2;
		int sp = 1;
		while(r<=n) {
			int j = 1;
			while(j<=sp) {
				System.out.print("    ");
				j++;
			}
			int i = 1;
			while(i<=s) {
				System.out.print("*  ");
				i++;
			}
			System.out.println();
			r++;
			s++;
			sp++;
		
		}

	}

}
