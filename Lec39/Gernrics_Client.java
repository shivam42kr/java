package Lec39;

import java.util.ArrayList;

public class Gernrics_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Genrics_Demo<String, Integer> g = new Genrics_Demo<>();
		LinkedList<String> ll = new LinkedList<>();
		ll.Addlast("Ram");
		ll.Addlast("Raj");
		ll.Addlast("Rajan");
		ll.Display();
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Ritik");
		list.add(9.0);
		System.out.println(list);
	}

}
