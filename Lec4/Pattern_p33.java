package Lec4;

public class Pattern_p33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int row = 1;
		int star = 1;
		int space = n-1;
		int val = n;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while(j<=star) {
				if(p==10) {
					System.out.print(0+" ");
				}else {
                System.out.print(p+" ");
				}
                if(j<=star/2) {
                	p++;
                }else {
                	p--;
                }
				j++;
				
			}
			val--;
			System.out.println();
			row++;
			star+=2;
			space--;
		}

	}

}
