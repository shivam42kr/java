package Lec4;

public class Pattern_p21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n+2;
		while(row<=n) {
//			star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
//			space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
//			star
			int k = 1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
            star++;
            space-=2;
			System.out.println();
			row++;
//			star++;
//			space--;
		}

	}

}
