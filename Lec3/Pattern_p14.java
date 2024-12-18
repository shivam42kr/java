package Lec3;
import java.util.*;
public class Pattern_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
//		1st
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
				System.out.print("* ");
				j++;
			}
		    System.out.println();
			row++;
			star++;
			space--;
		}
//		2nd
		int r = 1;
		int s = 4;
		int sp = 1;
		while(r<=n) {
//			space
			
			int i = 1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
//			star
			int j=1;
			while(j<=s) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			r++;
			s--;
			sp++;
			
		}
		

	}

}
