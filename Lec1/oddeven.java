package Lec1;
import java.util.*;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("give a input n:\t");
		int n = sc.nextInt();
//		int n = 67;
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
			
		}
	}
}
