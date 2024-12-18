package Lec_2;
import java.util.*;

public class sum_of_4367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("give a input n:\t");
		int n = sc.nextInt();
//		int n = 3467;
//		int n = 4367;
		int sum=0;
	
		while(n>0) {
			int rem = n%10;
			 sum = sum + rem;
			 n = n/10;
			
		}
		System.out.println(sum);
		

	}

}
