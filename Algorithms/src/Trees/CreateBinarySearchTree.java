package Trees;

public class CreateBinarySearchTree {
	public static void main(String...args) {
		TreeNode node = new TreeNode(5);
		
		node.insert(3);
		node.insert(2);
		node.insert(1);
		node.insert(4);
		node.insert(7);
		node.insert(6);
		
		inOrderTraversal(node);
	}
	
	public static void inOrderTraversal(TreeNode node) {
		
		if(node==null) {return;}
		
		inOrderTraversal(node.left);
		System.out.println(node.data);
		inOrderTraversal(node.right);
	}
}

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
	}
	
	public void insert(int value) {
		if(value<=data) {
			if(left==null) {
				left = new TreeNode(value);
			}else {
				left.insert(value);
			}
		}else {
			if(right==null) {
				right = new TreeNode(value);
			}else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value==data) {return true;}
		if(value<data) {
			if(left==null) {
				return false;
			}else {
				return left.contains(value);
			}
		}else {
			if(right==null) {
				return false;
			}else {
				return right.contains(value);
			}
		}
	}
}
