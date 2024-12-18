package Lec32;

public class Sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2, 7));
		System.out.println(Add(2, 7, 11));
		System.out.println(Add(2, 7, 9.5));
		System.out.println(Add(2, 3, 4, 45, 5, 6, 6, 6, 6, 6, 6, 5));

	}
	public static int Add(int a, int b) {
		return a + b;
	}
	public static int Add(int a, int b, int c) {
		return a + b + c;
	}
	public static int Add(int a, int b, double d) {
		return (int) (a + b + d);
	}
	public static int Add(int x, int ... a) {  // same 1k or bana h to 1k
		                                        //type of argument or object
	    int sum = 0;                            // change ker lenge
		for(int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		return sum;
	}

}
