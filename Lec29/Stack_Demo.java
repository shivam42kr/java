package Lec29;
import java.util.Stack;
// Data structure  started
public class Stack_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop()); // remove
		System.out.println(st);
		System.out.println(st.isEmpty());// true or false
		System.out.println(st.size());
		
		
	}
}
