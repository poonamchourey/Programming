package ds;

public class ReverseList {

	public static class Node {
		int data;
		Node next;
	}

	static Node head;

	static void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node t = null;
			t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = node;
		}
	}

	static Node reverseList(Node node) {

		Node prev = null;
		Node current = node;
		Node nextNode = null;

		
		while (current != null) {

			nextNode = current.next;
			current.next = prev;
			prev =current;
			current = nextNode;
		}
		node = prev;
		return node;
	}

	
	public static void show(Node head) {
		if (head == null)
			return;
		else {
			Node t = null;
			t = head;
			while (t.next != null) {
				System.out.print(t.data + " ");
				t = t.next;
			}
			System.out.print(t.data);
		}

	}

	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		Node h = reverseList(head);
		show(h);
	}

}
