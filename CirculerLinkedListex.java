package ds;

//GeeksForGeek for reference ......
public class CirculerLinkedListex {
	static class Node {
		int data;
		Node next;
	}

	static Node head;

	static Node addAtEmpty(Node last, int data) {
		Node node = new Node();
		if (last == null) {
			node.data = data;
			last = node;
			last.next = last;
		} else {
			return last;
		}
		return last;

	}

	static Node addAtbegining(Node last, int data) {
		Node temp = new Node();

		if (last == null) {
			addAtEmpty(last, data);
		}
		temp.data = data;
		temp.next = last.next;
		last.next = temp;

		return last;
	}

	static void traverseList(Node last) {
		Node temp;
		temp = last.next;
		do {
			System.out.print(" " + temp.data);
			temp = temp.next;
		} while (temp != last.next);
	}

	static Node addAtEnding(Node last, int data) {

		Node temp = new Node();

		if (last == null) {
			addAtEmpty(last, data);
		}
		temp.data = data;
		temp.next = last.next;
		last.next = temp;
		last = temp;

		return last;

	}

	private static Node addAfter(Node last, int data, int dataToBeEntered) {
		Node temp;
		Node newNode = new Node();
		newNode.data = dataToBeEntered;
		temp = last.next;

		while (temp.data != data) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return last;
	}

	static Boolean checkIfCircularOrNot(Node last) {

		Node temp;
		Node p;
		p = last.next;
		temp = p.next;
		while (temp != null) {
			if (temp == p) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	static void addSingleLinkedList(int data) {

		Node node = new Node();

		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}

	}

	static void traverseSingleLinkedList() {
		if (head == null) {
			return;
		}
		Node t = head;
		while (t != null) {
			System.out.print(" " +t.data );
			t=t.next;
		}
	}

	public static void main(String[] args) {
		Node last = null;
		last = addAtEmpty(last, 1);
		last = addAtbegining(last, 2);
		last = addAtEnding(last, 3);
		traverseList(last);
		System.out.println();
		last = addAfter(last, 1, 4);
		traverseList(last);
		Boolean b = checkIfCircularOrNot(last);
		System.out.println(b);
		addSingleLinkedList(1);
		addSingleLinkedList(2);
		addSingleLinkedList(3);
		addSingleLinkedList(4);
		traverseSingleLinkedList();
		Boolean boo = checkIfCircularOrNot(head);
		System.out.println(boo);
	}

}
