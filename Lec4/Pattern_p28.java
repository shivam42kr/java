package Lec4;

public class Pattern_p28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		int val = 1;
		while(row<=n) {
//			space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
//			star
			int j = 1;
			int p = val;
			while(j<=star) {
				System.out.print(p+" ");
				if(j<star/2+1) {
					p++;
				}
				else {
					p--;
				}
				j++;
			}
//			next row prep
			row++;
			val++;
			System.out.println();
			space--;
			star+=2;
		}

	}

}
