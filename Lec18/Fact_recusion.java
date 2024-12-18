package Lec18;

public class Fact_recusion {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n));

	}
	public static int fac(int n) {
		if(n ==1 ) {  //base case
			return 1;
		}
		int fn = fac(n-1); //smaller problem     // TC=o(n)
		return n * fn;   // case -3
	}

}
