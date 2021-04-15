public class DoublyLinkList {

	class Node {
		int data;
		Node previous;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static Node head;
	Node tail = null;

	// 1.Add node first
	public void addNodeFirst(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			head.previous = newNode;
			newNode.next = head;
			newNode.previous = null;
			head = newNode;
		}
	}

	// 2.Add node last
	public void addNodeLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {

			head = tail = newNode;
			head.previous = null;
			tail.next = null;

		} else {

			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}

	}

	// To print the list
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	// 3.Add node at index
	public void insertAtIndex(int index, int data) {

		Node newNode = new Node(data);
		if (index == 1) {
			addNodeFirst(data);
		} else {
			Node current = head;
			int countIndex = 1;
			while (countIndex != index - 1) {
				current = current.next;
				countIndex++;
			}
			newNode.next = current.next;
			current.next.previous = newNode;
			newNode.previous = current;
			current.next = newNode;

		}
	}

	// 4. Remove first node
	public void removeFirstNode() {
		Node current = head;
		head = current.next;
		head.previous = null;
	}

	// 5. Remove last node
	public void removeLastNode() {

		tail = tail.previous;
		tail.next = null;
	}

	// 6. Remove node at an index.
	public void removeNodeAtIndex(int index) {

		Node current = head;
		int countIndex = 1;
		if (countIndex == index) {
			removeFirstNode();
		}
		while (countIndex != index) {
			current = current.next;
			countIndex++;
		}
		if (current.next == null) {
			removeLastNode();
		} else {
			current.next.previous = current.previous;
			current.previous = current.next;
			current = null;
		}

	}

	// Find a node.Check list have particular node or not
	// this method return true if node exist else false
	public boolean findNode(Node node, int searchedItem) {
		if (head == null) {
			return false;
		}
		if (node.data == searchedItem) {
			return true;
		}
		if (node.next == null) {
			return false;
		}
		return findNode(node.next, searchedItem);

	}

	public static void main(String args[]) {

		DoublyLinkList dln = new DoublyLinkList();
		dln.addNodeFirst(2);
		dln.addNodeFirst(12);
		dln.display();
		dln.addNodeLast(8);
		dln.display();
		dln.insertAtIndex(2, 24);
		dln.display();
		System.out.println("item found in list : " + dln.findNode(head, 2));
		dln.removeFirstNode();
		dln.display();
		dln.removeLastNode();
		dln.display();
		dln.removeNodeAtIndex(2);
		dln.display();
	}

}
