/* Four methods are given in binary search tree:
	1. addData 
	2. inOrder 
	3. preOrder
	4. postOrder
*/

/*
	@TEERTH KOLHI
*/
public class BinarySearchTree{
	class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	static Node root;
	BinarySearchTree(int value){
		root = new Node(value);
	}
	BinarySearchTree(){
		root = null;
	}
	public void addData(int data){
		root = insertRec(root, data);
	}
	public Node insertRec(Node root, int data){
		if(root == null){
			root = new Node(data);
			return root;
		}
		if(data < root.data){
			root.left = insertRec(root.left, data);
		}
		else if(data > root.data){
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	public static void inOrder(Node root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void preOrder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root){
		if(root == null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String...args){
		BinarySearchTree tree = new BinarySearchTree();
		tree.addData(12);
		tree.addData(7);
		tree.addData(9);
		tree.addData(15);
		tree.addData(11);
		tree.addData(16);
		tree.addData(9);
		tree.addData(2);
		
		System.out.print("\nIn-order traversal: ");
		tree.inOrder(root);
		System.out.println();
		
		System.out.print("Pre-order traversal: ");
		tree.preOrder(root);
		System.out.println();
		
		System.out.print("Post-order traversal: ");
		tree.postOrder(root);
		System.out.println();
	}
}