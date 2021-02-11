package Chapter7;

public class TreeNode {
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	
	public TreeNode(Integer data) {
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public TreeNode find(Integer data) {
		if(this.data == data)
			return this;
		if(leftChild != null && data < this.data)
			return leftChild.find(data);
		if(rightChild != null)
			return rightChild.find(data);
		return null;
	}
	
	public void insert(Integer data) {
		if(data >= this.data) {
			if(this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else 
				this.rightChild.insert(data);
		}
		else {
			if(this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.insert(data);
		}
		
	}
	
	public Integer smallest() {
		if(this.leftChild == null)
			return this.data;
		return this.leftChild.smallest();
	}
	
	public Integer largest() {
		if(this.rightChild == null)
			return this.data;
		return this.rightChild.largest();
	}
	
	public void traverseInOrder() {
		if(this.leftChild != null)
			this.leftChild.traverseInOrder();
		System.out.print(this + " ");
		if(this.rightChild != null)
			this.rightChild.traverseInOrder();
	}
	
	public boolean isLeaf() {
		return this.leftChild == null && this.rightChild == null;
	}
	
	public int numOfLeafNodes() {
		if(isLeaf()) return 1;
		int leftLeaves  = 0;
		int rightLeaves = 0;
		if(this.leftChild != null)
			leftLeaves = this.leftChild.numOfLeafNodes();
		if(this.rightChild != null)
			rightLeaves = this.rightChild.numOfLeafNodes();
		return leftLeaves + rightLeaves;
	}
	
	public int height() {
		if (isLeaf()) return 1;
		int left = 0;
		int right = 0;
		if(this.leftChild != null)
			left = this.leftChild.height();
		if(this.rightChild != null)
			right = this.rightChild.height();
		return (left > right) ? (left +1) : (right +1);
	}
	
	public static TreeNode addSorted(int[] data, int start, int end) {
		if(end >= start) {
			int mid = (start + end) / 2;
			TreeNode newNode = new TreeNode(data[mid]);
			newNode.leftChild = addSorted(data,start,mid-1);
			newNode.rightChild = addSorted(data,mid+1,end);
			return newNode;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.data);
	}

}
