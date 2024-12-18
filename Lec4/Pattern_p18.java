package Lec4;

public class Pattern_p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n/2;
		int star = 1;
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
			if(row<=n/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
//			next row prep
			row++;
			System.out.println();
//			space--;
//			star+=2;
		}

	}

}
