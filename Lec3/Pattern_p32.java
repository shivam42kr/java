package Lec3;

public class Pattern_p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
//        1st
		while(row<=n) {
			int i = 1;
			
			while(i<=star*2-1) {
				if(i%2==0) {
					System.out.print("*  ");
				}
				else {
				System.out.print(row+"  ");
				}
				i++;
				
			}
			System.out.println();
			row++;
			star++;
			
		}
//		2nd
		int r = 4;
		int st = 4;

		while(r>=1) {
			int i = 1;
			
			while(i<=st*2-1) {
				if(i%2==0) {
					System.out.print("*  ");
				}
				else {
				System.out.print(r+"  ");
				}
				i++;
				
			}
			System.out.println();
			r--;
			st--;
		}	

	}

}
