package Lec5;

public class For_Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
		
		int j = 1;
		for(; j<=5; j++) {
			System.out.println(j);
		}
		
		int k = 1;
		for(; k<=5; ) {
			System.out.println(k);
			k++;
		}

	}

}
