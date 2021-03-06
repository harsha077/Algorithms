package TreesAndGraphs;

public class CreateBinaryTree {

	public static Node root;
	
	public static void main(String[] args) {
		
		CreateBinaryTree cbt = new CreateBinaryTree();
		
		cbt.test();
	}
	
	public void test()
	{
		CreateBinaryTree cbt = new CreateBinaryTree();
		
		cbt.addNode(2);
		cbt.addNode(5);
		cbt.addNode(7);
		cbt.addNode(9);
		cbt.addNode(10);
		
	}
	
	public void addNode(int intInpValue){
		if(root == null){
			root = new Node(intInpValue);
			return;
		}
		
		Node temp = root;
		
		while(temp!=null){
			if(temp.intValue > intInpValue){
				if(temp.left == null){
					temp.left = new Node(intInpValue);
				}else{
					temp = temp.left;
				}
			}
			
			if(temp.intValue < intInpValue){
				if(temp.right == null){
					temp.right = new Node(intInpValue);;
				}else{
					temp = temp.right;
				}
			}
		}
	}
}

class Node{
	int intValue;
	Node left = null;
	Node right = null;
	
	public Node(int intValue){
		this.intValue = intValue;
	}
}
 