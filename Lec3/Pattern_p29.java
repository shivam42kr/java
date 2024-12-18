package Lec3;

public class Pattern_p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
//			space
			int j= 1;
			while(j<=space) {
				System.out.print("  ");
				j++;				
			}
//			1st star
			int i = 1;
			int k=1;
			while(i<=star) {
				if(i==(k+i)-1) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
//				System.out.print("* ");
				i++;
				k++;
				
			}
			i=row-1;
			while(i>=1) {
				if(i+(row-1)==row) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
//				System.out.print("* ");
				i--;
			}
			System.out.println();
			row++;
			star++;
			space--;
		}
		

		
		

	}

}
