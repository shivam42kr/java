package Lec4;

public class Pattern_p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = n-1;
		while(row<=2*n-1) {
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if(row<5) {
				star--;
				space--;
			}else {
				star++;
				space++;
			}
			System.out.println();
			row++;
//			star--;
//			space--;
		}

	}

}
