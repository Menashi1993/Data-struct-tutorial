package Chapter4;

public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList Dlist = new DoublyLinkedList();
	
	Dlist.insertAtHead(5);
	Dlist.insertAtHead(10);
	Dlist.insertAtHead(2);
	Dlist.insertAtHead(12);

	
	System.out.println(Dlist);
	System.out.println("Length is : " + Dlist.length());
	new InsertionSorter().sort(Dlist);
	System.out.println(Dlist);
	}
}
