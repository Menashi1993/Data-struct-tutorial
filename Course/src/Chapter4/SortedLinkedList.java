package Chapter4;

public class SortedLinkedList {
	private Node head;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(this.head == null || this.head.getData() > newNode.getData()) {
			newNode.setNextNode(this.head);
			this.head = newNode;
			return;
		}
		
		Node current = this.head;
		while(current != null && current.getNextNode() != null && current.getNextNode().getData() < newNode.getData()) {
			current = current.getNextNode();
		}
		
		newNode.setNextNode(current.getNextNode());
		current.setNextNode(newNode);
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while(current !=null) {
			result+= current.toString() + ",";
			current = current.getNextNode();
		}
		result += "}";
		return result;	
	}
	
	public static void main(String args[]) {
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(6);
		sll.insert(4);
		sll.insert(2);
		sll.insert(8);
		sll.insert(3);
		sll.insert(5);
		System.out.println(sll);
	}
}
