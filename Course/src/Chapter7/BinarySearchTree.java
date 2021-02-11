package Chapter7;

public class BinarySearchTree {
	public TreeNode root;
	
	public void insert(Integer data) {
		if(root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
		
	}
	
	public TreeNode find(Integer data) {
		if(root != null)
			return root.find(data);
		return null;
	}
	
	
	public void delete(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null)
			return;
		
		while(current.getData() != null && current.getData() != data) {
			parent = current;
			
			if(data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			}else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
	
		
		if(current == null)
			return;
		
		if(current.getLeftChild() == null && current.getRightChild() == null) {
			if(current == root) {
				root = null;
			}else {
			if(isLeftChild)
				parent.setLeftChild(null);
			else
				parent.setRightChild(null);	
			}
		}
		
		else if(current.getRightChild() == null) {
			if(current == root) {
				root = current.getLeftChild();
			}else if(isLeftChild) {
				parent.setLeftChild(current.getLeftChild());
			}else {
				parent.setRightChild(current.getLeftChild());
			}
		}
		
		else if(current.getLeftChild() == null) {
			if(current == root) {
				root = current.getRightChild();
			}else if(isLeftChild) {
				parent.setLeftChild(current.getRightChild());
			}else {
				parent.setRightChild(current.getRightChild());
			}
		}

		
		else {
			TreeNode successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			}else if(isLeftChild){
				parent.setLeftChild(successor);
			}else {
				parent.setRightChild(successor);
			}
			current.setLeftChild(successor.getLeftChild());				
		}	
		
		
	}
	
	private TreeNode getSuccessor(TreeNode node) {
		TreeNode successor = node;
		TreeNode parentOfSuccessor = node;
		TreeNode current = successor.getRightChild();
		
		while(current != null) {
			parentOfSuccessor = successor;
			successor = current;
			current = current.getLeftChild();
		}
		
		if(successor != node.getRightChild()) {
			parentOfSuccessor.setLeftChild(successor.getRightChild());
			successor.setRightChild(node.getRightChild());
		}
		
		return successor;
	}
	
	public Integer smallest() {
		if(this.root != null)
			return root.smallest();
		return null;
	}
	
	public Integer largest() {
		if(this.root != null)
			return root.largest();
		return null;
	}
	
	public void traverseInOrder() {
		if(this.root != null)
			this.root.traverseInOrder();
		System.out.println();
	}
	
	
	public int numOfLeafNodes() {
		if(this.root == null)
			return 0;
		return this.root.numOfLeafNodes();
	}
	
	public int height() {
		if(this.root == null)
			return 0;
		return this.root.height();
	}
	
	public static BinarySearchTree createFromSortedArray(int[] data) {
		BinarySearchTree bst = new BinarySearchTree();
		if(data != null && data.length > 0) {
			bst.root = TreeNode.addSorted(data,0,data.length-1);
		}
		return bst;
	}
	
	
	public static void main(String[] args) {
		int[] sample = {212,580,6,7,28,84,112,434};
		BinarySearchTree bst = new BinarySearchTree();
		for(int x : sample) {
			bst.insert(x);
		}
		System.out.println(bst.find(112));
		System.out.println(bst.smallest());
		System.out.println(bst.largest());
		System.out.println(bst.numOfLeafNodes());
		System.out.println(bst.height());
		bst.traverseInOrder();
		bst.delete(84);
		System.out.println(bst.find(84));
		bst.traverseInOrder();
		
	}

	
}
