package Lec8;

public class Function_Demo2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 7;
		Add(a , b);
		System.out.println("hello");
		

	}
	public static void Add(int a, int z) {
		int c = a + z;
		Sub(c , z);
		System.out.println(c);
	}
	public static void Sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}



}
