package Lec36;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class Binary_Tree {
//TC = o(n)
	class Node {
		int val;   /// three node of tree --> data ,left, right
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public Binary_Tree() {
		root = CreateTree();  
		// ye tree create karega or first node dega 
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node node = new Node(); //address 1k. first
		node.val = item;  //data set hoga
		boolean hlc = sc.nextBoolean();
		if(hlc==true) { // left subtree create hoga
			node.left = CreateTree();
		}
		
		boolean hrc = sc.nextBoolean();
		if(hrc==true) {//right
			node.right = CreateTree();
		}
		return node;
	}
	public void Display() {
		Display (root);  //this program Display aceses to the client se
	}  // bahar ka display ise call karega or ye niche wale ko     // kiya jayega ok
//	Display
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		String s = "";
		s = "<--" + s + nn.val + "-->";
		if(nn.left != null) {
			s = nn.left.val + s;
		}else {
			s = "." + s;
		}
		if(nn.right != null) {
			s = s + nn.right.val;
		}else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);//left subtree visit
		Display(nn.right);// right subtree visit
	}
	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int l = max(nn.left);
		int r = max(nn.right);
		return Math.max(l, Math.max(r, nn.val));

	}
	public boolean find(int item) {
		return find(root,item);
	}
	private boolean find(Node nn, int item) {
		if(nn == null) {
			return false;
		}
		if(nn.val == item) {
			return true;
		}
		boolean l = find(nn.left,item);
		boolean r = find(nn.right,item);
		return l || r;
	}
	//height(ht)
	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;//ager ht 0 lenge to return -1 or 1 ht lenge to return 0
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}
	// Traversal tree
	public void PreOrder() {
		PreOrder(this.root);
	}
	private void PreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}
	private void INOrder(Node node) {
		if(node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

    private void PostOrder(Node node) {
		if(node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");
		
	}
    public void levelorder() {
//    	LinkedList<Node> q = new LinkedList<>();
    	Queue<Node> q = new LinkedList<>();
		q.add(root);// add last
		while (!q.isEmpty()) {// jab tak Q khali na ho
			Node rv = q.remove();// removefirst
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
    }

}
