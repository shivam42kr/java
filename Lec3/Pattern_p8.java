package Lec3;

public class Pattern_p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 5;
		while(row<=n) {
//			star
			int i = 1;
			while(i<=star) {
				int j=6-i;
				if(row==i||row==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
//				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			
		}

	}

}
