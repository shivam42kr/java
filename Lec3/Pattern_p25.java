package Lec3;
import java.util.*;

public class Pattern_p25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int num = 1;
		int space = n-1;
		while(row<=n) {
//			space
			int i = 1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
//			star
			int j = 1;
			while(j<=star) {
				System.out.print(num);
				if(num<=9) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
				j++;
				num++;
			}
			System.out.println();
			row++;
			star+=2;
			space--;
			
		}

	}

}
