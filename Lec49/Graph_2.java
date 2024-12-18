package Lec49;

import java.util.*;

public class Graph_2 {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and cost
		map.get(v2).put(v1, cost);
	}
	
//--> BFS..	
	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int v = q.remove();

			// 2. Ignore if Already visited
			if (visited.contains(v)) {
				continue;
			}

			// 3. Marked visited
			visited.add(v);

			// 4.self work
			if (v == des) {
				return true;
			}

			// Add unvisited nbrs
			for (int nbrs : map.get(v).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}	
// ---> DFS
	
	public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			// 1. remove
			int v = s.pop();
			// 2. Ignore if Already visited
			if (visited.contains(v)) {
				continue;
			}
			// 3. Marked visited
			visited.add(v);

			// 4.self work
			if (v == des) {
				return true;
			}
			// Add unvisited nbrs
			for (int nbrs : map.get(v).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;
	}


}
