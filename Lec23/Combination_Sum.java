package Lec23;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
        // Lead-39
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2,3,5};
		int amount = 10;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ll = new ArrayList<>();
		Combination(coin, amount, ll,0,ans);
		System.out.println(ans);
	}
  public static void Combination(int []coin, int amount, List<Integer> ll,
		                                     int idx, List<List<Integer>> ans) {
		if(amount == 0) {
//			System.out.print(ll + " ");
			ans.add(new ArrayList<>(ll));  // new arraylist ise liye use kare taki
			return;                        //ans new array me store ho jaye ..   
		}
		for(int i = idx; i < coin.length; i++) {
			if(amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll ,i, ans);  
				                                       // i- infinite sufly
				ll.remove(ll.size() - 1);    // ye iseliye euse h taki ham last
			}                              //element ko remove kerke niw value    
		}                                  // store kare..
	}
}
