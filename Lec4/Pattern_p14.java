package Lec4;

public class Pattern_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=2*n-1) {
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
			if(row<n){
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
			row++;
			
			
		}

	}

}