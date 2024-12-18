package Lec4;

public class Pattern_p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
//		int val = 1;
//		int space1 = 1;
		while(row<=n) {
//			space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
//			star
			int j = 1;
//			int p = val;
			while(j<=star) {
				if(j==1||j==star) {
				System.out.print(row+" ");
				}else {
					System.out.print("0 ");
				}
				j++;
			}
////			space
//			int k = 1;
//			while(k<=space1) {
//				System.out.print("  ");
//				k++;
//			}
//			next row prep
			row++;
//			val++;

			System.out.println();
			space--;
			star+=2;
		}

	}

}
