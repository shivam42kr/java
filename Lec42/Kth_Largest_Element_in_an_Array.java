package Lec42;

import java.util.*;

public class Kth_Largest_Element_in_an_Array {
//leetcode 215
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		System.out.println(Kth_Largest_Element(arr, k));

	}

	public static int Kth_Largest_Element(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
//		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());//max heap
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);//pq me add karega

		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {//peek method top ki value btata
				pq.remove();// pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();

	}


}
