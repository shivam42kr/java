package Lec4;

public class Pattern_p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
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
				System.out.print(j+" ");
				j++;
			}
//			next row prep
			row++;
			System.out.println();
			space--;
			star+=2;
		}
		

	}

}