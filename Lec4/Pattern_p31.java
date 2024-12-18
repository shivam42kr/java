package Lec4;

public class Pattern_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			int val = n;
			while(i<=star) {
				if(row==val) {
				System.out.print("* ");
				}
				else {
					System.out.print(val+" ");
				}
				i++;
				val--;
			}
			System.out.println();
			row++;
		}

	}

}
