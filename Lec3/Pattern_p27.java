package Lec3;
import java.util.*;
public class Pattern_p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row<=n) {
//			space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
//			star
			int j = 1;
			while(j<=star) {
				System.out.print(j+" ");
				j++;
			
			
			}
			i=row-1;
			while(i>=1) {
				System.out.print(i+" ");
				i--;
			}
			System.out.println();
			row++;
			star++;
			space--;
		}

	}

}
