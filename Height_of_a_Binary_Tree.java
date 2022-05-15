public class Height_of_a_Binary_Tree{
	class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	static Node root;
	Height_of_a_Binary_Tree(int val){
		root = new Node(val);
	}
	Height_of_a_Binary_Tree(){
		root = null;
	}
	public void addData(int val){
		root = insertRec(root, val);
	}
	public Node insertRec(Node root, int value){
		if(root == null){
			root = new Node(value);
			return root;
		}
		if(value > root.data)
			root.right = insertRec(root.right, value);
		else if(value < root.data)
			root.left = insertRec(root.left, value);
		return root;
	}
	public void pre_order(Node root){
		if(root == null)
			return;
		System.out.print(root.data+" ");
		pre_order(root.left);
		pre_order(root.right);
	}
	public static int height(Node node){
		if(node == null)
			return 0;
		return Math.max(height(node.left), height(node.right))+1;
	}
	public static void main(String...args){
		Height_of_a_Binary_Tree tree = new Height_of_a_Binary_Tree();
		tree.addData(11);
		tree.addData(3);
		tree.addData(15);
		tree.addData(31);
		tree.addData(3);
		tree.addData(7);
		tree.addData(8);
		tree.addData(4);
		tree.pre_order(root);
		
		System.out.println("\nHeight of the binary tree is: "+tree.height(root));
		
	}
}