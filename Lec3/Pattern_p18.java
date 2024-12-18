package Lec3;

public class Pattern_p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int star = 1;
		int space = n-1;
//		/1st
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
				System.out.print("*  ");
				i++;
			}
			System.out.println();
			row++;
			star+=2;
			space--;
		}
//		2nd
		n = 5;
		int r = 1;
		int s = n;
		int sp = n-2;
		while(r<=n) {
//			space
			int j = 1;
			while(j<=sp) {
				System.out.print(" ");
				j++;
			}
//			star
			int i = 1;
			while(i<=s) {
				if(r<6) {
					System.out.print(" ");
				}else {
					System.out.println("  ");
				}
				System.out.print("* ");
				i++;
			}
			
			System.out.println();
			r++;
			s-=2;
			sp+=2;
		}


	}

}
