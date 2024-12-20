package Lec33;

public class LinkedList {
	class Node {
		int data;    // class ham isliye baneye h ,ek sath 2 infomation rakh rahe ha
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	//o(1)
	public void Addfirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if(size == 0) {
			head = nn;   //address
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	//o(1)
	public void Addlast(int item) {
		if(size == 0) {
			Addfirst(item);
		}
		else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public void Addatindex(int item, int k) {
		if(k == 0) {
			Addfirst(item);	
		}
		else if(k == size) {
			Addlast(item);
		}
		else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}
	//o(1)
	public int getfirst() {
		return head.data;
	}
	//o(1)
	public int getlast() {
		return tail.data;
	}
	//o(N)
	public int getatindex(int k) {
		return GetNode(k).data;
	}
	//o(1)
	public int  removefirst() {
		int rv = head.data;
		if(size == 1) {
			head = null;
			tail = null;
			size--;
		}
		else {
		    Node temp = head;
		    head = head.next;
		    temp.next = null;
		    size--;
		}
		return rv;
	}
	//o(1)
	public int removelast() {
		if(size == 1) {
			return removefirst();
		}else {
			Node sl = GetNode(size - 2);
			int rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;
		}
	}
	//o(N)
	public int removeatindex(int k) {
		if(k == 0) {
			return removefirst();
		}
		else if(k == size - 1) {
			return removelast();
		}
		else {
			Node K_1th = GetNode(k - 1);
			Node kth = GetNode(k);
			K_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.data;
		}
	}
	
	// internaly is logic ko barr-2 use karna h(is liye ek barr bana lo)
	private Node GetNode(int k) {
		Node temp = head;
		for(int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public int size() {
		return size;
	}
	
	public void Display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;  // refrance var..
		}
		System.out.println(".");
	}

}
