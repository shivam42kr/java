package Lec39;
//stack interface
public interface StackI extends DSAI, DynamicStackI {

	
	public  void push();
	public int pop(); 
	
	public int size();
	int val = 9; // public static final
	
	default void Sayhey() {
		System.out.println("hey");
	}
	public static void Sayhey1() {
		System.out.println("hey");
	}
	private int fun1() {
		return 9; 
	}
}
