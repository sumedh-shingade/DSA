package sumya;


class SinglyList {
	// Node is static member class of SinglyList
	static class Node {
		// Node class fields
		private int data;
		private Node next;
		// Node class methods
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}

	// List class fields
	private Node head;
	//private Node tail;
	
	// List class methods
	public SinglyList() {
		head = null;
		//tail = null;
	}
	void display() {
		System.out.println("List : ");
		int count=0;
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
			count++;
		}
		System.out.println("");
		System.out.println("There are " + count + " elements");
	}
	void addFirst(int val) {
		// create new node and init it
		Node newNode = new Node(val);
		newNode.next = head;
		// head should point to new node
		head = newNode;
	}
}
public class LengthSLL {
public static void main(String[] args) {
	
	
	SinglyList s=new SinglyList();
	s.addFirst(10);
	s.addFirst(20);
	s.addFirst(30);
	s.addFirst(30);
	s.addFirst(30);
	s.display();	
}
}
