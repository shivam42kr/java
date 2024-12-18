package Lec3;

public class pattern_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 5;
		int space = 0;
//		1st
		while(row<=n) {
//			space
			int i = 1;
			while(i<=space) {
				 System.out.print("  ");
				 i++;
			}
//			star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
//			next row prep
			System.out.println();
			row++;
			star--;
			space+=2;
		}
//		2nd
//		 n = 5;
		int r = 1;
		int s = 1;
		int sp = n-1;
		while(r<=n) {
//			space
			int i = 1;
			while(i<=sp) {
				 System.out.print("    ");
				 i++;
			}
//			star
			int j = 1;
			while(j<=s) {
				System.out.print("* ");
				j++;
			}
//			next row prep
			System.out.println();
			r++;
			s++;
			sp--;
		}

	}

}
