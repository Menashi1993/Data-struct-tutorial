package Chapter4;

public class DoublyLinkedNode {
	private Integer data;
	private DoublyLinkedNode previousNode;
	private DoublyLinkedNode nextNode;
	
	public DoublyLinkedNode(int data) {
		this.data = data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public void setPreviousNode(DoublyLinkedNode previousNode) {
		this.previousNode = previousNode;
	}

	public void setNextNode(DoublyLinkedNode nextNode) {
		this.nextNode = nextNode;
	}

	public Integer getData() {
		return data;
	}

	public DoublyLinkedNode getPreviousNode() {
		return previousNode;
	}

	public DoublyLinkedNode getNextNode() {
		return nextNode;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	

}
