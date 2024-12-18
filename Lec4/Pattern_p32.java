package Lec4;

public class Pattern_p32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
	    int val = 1;
		while(row<=2*n-1) {
//			star
			int i = 1;
			while(i<=star) {
				if(i%2!=0) {
				System.out.print(val+" ");
				}
				else {
					System.out.print("* ");
				}
			
				i++;
			}
			if(row<n) {
				star+=2;
			}
			else {
				star-=2;
			}
			if(row<n) {
				val++;
			}
			else {
				val--;
			}

			System.out.println();
			row++;
			
//			star++;
		}


	}

}
