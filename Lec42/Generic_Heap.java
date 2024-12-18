package Lec42;

import java.util.ArrayList;

import Lec41.Heap;

public class Generic_Heap<T extends Comparable<T>> {

	private ArrayList<T> ll = new ArrayList<>();

	public void add(T item) {
		ll.add(item);
		upheapify(ll.size() - 1);//index num. batayega

	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
//		if (ll.get(pi) > ll.get(ci)) {
		if (islarger(ll.get(pi), ll.get(ci)) > 0) {
			Swap(pi, ci);
			upheapify(pi);
		}

	}

	private void Swap(int pi, int ci) {
		// TODO Auto-generated method stub
		T pith = ll.get(pi);
		T cith = ll.get(ci);
		ll.set(pi, cith);
		ll.set(ci, pith);

	}

	public T get() {
		return ll.get(0);
	}

	public void Display() {
		System.out.println(ll);
	}

	public int size() {
		return ll.size();
	}

	public int islarger(T o1, T o2) {
		return o1.compareTo(o2);
	}
	public T remove() {
		T rv = ll.get(0);
		Swap(0, ll.size() - 1);
		ll.remove(ll.size() - 1);
		downheapify(0);
		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && islarger(ll.get(lci), ll.get(mini)) > 0) {
			mini = lci;

		}
		if (rci < ll.size() && islarger(ll.get(rci), ll.get(mini)) > 0) {
			mini = rci;

		}
		if (mini != pi) {
			Swap(pi, mini);
			downheapify(mini);

		}

	}

	public static void main(String[] args) {
		Heap hp = new Heap();
		hp.add(5);
		hp.add(7);
		hp.add(10);
		hp.add(2);
		hp.add(4);
		hp.add(6);
		hp.add(1);
		hp.add(8);
		hp.add(-2);
		hp.Display();
		System.out.println(hp.remove());
		hp.Display();

	}

}
