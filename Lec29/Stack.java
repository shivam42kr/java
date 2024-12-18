package Lec29;

public class Stack {
	protected int []arr;
    private int  idx = -1;
	
	public Stack() {
		arr = new int[5];
	}
	
	public Stack(int n) {
		arr = new int[n];
	}
	//0(1)
	public boolean isEmpty() {
		return idx == -1;  // ye content compaire kar raha h
	}
	
	//o(1)
	public boolean isfull() {
		return size() == arr.length;
	}
	//o(1)
	public void push(int item)throws Exception {
		if(isfull()) {
			throw new Exception("bklol Stack full hai");
		}
		idx++;
		arr[idx] = item;
	}
	//0(1)
	public int pop() throws Exception{
		if(isEmpty()) { // underflow 
			throw new Exception("bklol stack khali hai"); 
		}
		int rv = arr[idx];
		idx--;
		return rv;
	} 
	//0(1)
	public int peek() {
		int rv = arr[idx];
		
		return rv;
	}
	
//	o(1)
	public int size() {
		return idx + 1;
	}
	public void Display() {
		for(int i=0; i<=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
