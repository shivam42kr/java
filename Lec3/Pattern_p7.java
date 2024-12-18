package Lec3;

public class Pattern_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				if(row==1||i==1||row==n||i==n) {
					System.out.print("* ");
					
				}else {
					System.out.print("  ");
				}
				i++;
			}
			System.out.println();
			row++;
		}
	
		
		

	}

}
