package Lec3;

public class Pattern_p33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int row = n;
		int star = 1;
		int space = n-1;
		while(row>=1) {
//			space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
//			1st
			int i = 1;
			while(i<=star) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
			row--;
			star++;
			space--;
		}

	}

}
