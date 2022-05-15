/* 
	@TEERTH KOLHI
*/
import java.util.*;
public class Search_node_in_binaryTree{
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	static Node root;
	Search_node_in_binaryTree(int value){
		root = new Node(value);
	}
	Search_node_in_binaryTree(){
		root = null;
	}
	public void addData(int val){
		root = insertRec(root, val);
	}
	public Node insertRec(Node root, int val){
		if(root == null){
			root = new Node(val);
			return root;
		}
		if(val < root.data){
			root.left = insertRec(root.left, val);
		}
		else if(val > root.data){
			root.right = insertRec(root.right, val);
		}
		return root;
	}
	public void InOrder(Node root){
		if(root == null)
			return;
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public static boolean ifNodeExists(Node root, int val){
		if(root == null)
			return false;
		if(root.data == val)
			return true;
		boolean res1 = ifNodeExists(root.left, val);
		if(res1)
			return true;
		boolean res2 = ifNodeExists(root.right, val);
		
		return res2;
	}
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		Search_node_in_binaryTree tree = new Search_node_in_binaryTree();
		tree.addData(13);
		tree.addData(2);
		tree.addData(25);
		tree.addData(7);
		tree.addData(2);
		tree.addData(19);
		tree.InOrder(root);
		System.out.print("\nEnter the value that you want to search in binary tree: ");
		int value = sc.nextInt();
		if(ifNodeExists(root, value))
			System.out.println("Yes, this value exists in the binary tree...");
		else
			System.out.println("No, this value does not exist in the binary tree...");
	}
}