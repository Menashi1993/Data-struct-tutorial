package Chapter4;

public class LinkedListDemo {
	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	
	list.insertAtHead(5);
	list.insertAtHead(10);
	list.insertAtHead(2);
	list.insertAtHead(12);
	list.insertAtHead(19);
	list.insertAtHead(20);
	
	list.deleteAtHead();
	
	System.out.println(list);
	System.out.println("Length is : " + list.length());
	System.out.println("Found : " + list.find(12));
	System.out.println("Found : " + list.find(15));
	
	}
}
