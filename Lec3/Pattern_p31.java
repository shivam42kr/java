package Lec3;

public class Pattern_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = n;
			while(i>=1) {
				if(row==i) {
					System.out.print("* ");
				}
				else {
    			System.out.print(i+" ");
				}
				i--;
			}
			System.out.println();
			row++;
		}

	}

}
